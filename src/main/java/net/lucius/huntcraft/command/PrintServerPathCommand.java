package net.lucius.huntcraft.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;

import java.io.File;

public class PrintServerPathCommand {

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(CommandManager.literal("printpath")
                .executes(PrintServerPathCommand::run));
    }

    private static int run(CommandContext<ServerCommandSource> context) {
        String path = new File("").getAbsolutePath();
        final Text text = Text.literal(path);

        context.getSource().sendFeedback(text, true);
        return 1;
    }
}
