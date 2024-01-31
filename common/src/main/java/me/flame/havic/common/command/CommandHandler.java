package me.flame.havic.common.command;

import me.flame.havic.common.manager.Arguments;
import me.flame.havic.common.sender.Sender;

@FunctionalInterface
public interface CommandHandler<S extends Sender> {
    void handle(S sender, Arguments arguments);
}
