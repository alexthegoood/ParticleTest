package org.atg.particleTest;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.tree.LiteralCommandNode;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import io.papermc.paper.command.brigadier.Commands;
import org.bukkit.command.CommandSender;

public class PluginCommands {

    public static LiteralCommandNode<CommandSourceStack> command(final String cmdName){
        return Commands.literal(cmdName)
                .executes(ctx -> {
                    final CommandSender sender = ctx.getSource().getSender();
                    return Command.SINGLE_SUCCESS;
                })
                .build();
    }

}
