package net.lucius.huntcraft.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.dedicated.ServerPropertiesLoader;
import net.minecraft.text.Text;

import java.io.File;
import java.nio.file.Path;

public class PrintWorldPathCommand {

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(CommandManager.literal("printpath")
                .executes(PrintWorldPathCommand::run));
    }

    private static int run(CommandContext<ServerCommandSource> context) {
        String root = new File("").getAbsolutePath();
        String levelName = new ServerPropertiesLoader(Path.of(root)).getPropertiesHandler().levelName;

        final Text path = Text.literal(root + File.separator + levelName + File.separator + "scripts");

        context.getSource().sendFeedback(path, true);
        return 1;
    }
}
