package dev.kafein.cinematiccreator.cinematic.scenario;

import dev.kafein.cinematiccreator.CinematicCreator;
import dev.kafein.cinematiccreator.cinematic.viewer.Viewer;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;

final class ExampleScenario extends AbstractScenario {
    private final @NotNull ExecuteType executeType;
    private final @NotNull String command;

    ExampleScenario(@NotNull String value) {
        super(value);

        //parse the value to get the execute type and the command
        this.executeType = ExecuteType.valueOf(value.toUpperCase(Locale.ENGLISH).substring(1, value.indexOf(">")));
        this.command = value.substring(value.indexOf(">") + 1);
    }

    @Override
    public void invoke(@NotNull CinematicCreator plugin, @NotNull Viewer viewer) {
        String formattedCommand = this.command.replace("%player%", viewer.getName());
        switch (this.executeType) {
            case PLAYER:
                viewer.getPlayer().performCommand(formattedCommand);
                break;
            case CONSOLE:
                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), formattedCommand);
                break;
        }
    }

    @Override
    public @NotNull String getType() {
        return "COMMAND";
    }

    @Override
    public @NotNull String getDescription() {
        return "&aExecute a " + this.executeType.name().toLowerCase(Locale.ENGLISH) + " command &f" + this.command + "&a.";
    }

    @Override
    public @NotNull Material getIcon() {
        return Material.COMMAND_BLOCK;
    }

    private enum ExecuteType {
        PLAYER,
        CONSOLE
    }
}
