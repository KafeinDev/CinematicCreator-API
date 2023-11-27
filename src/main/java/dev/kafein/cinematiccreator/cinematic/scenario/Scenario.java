package dev.kafein.cinematiccreator.cinematic.scenario;

import dev.kafein.cinematiccreator.CinematicCreator;
import dev.kafein.cinematiccreator.ThisApiNotForImplementationException;
import dev.kafein.cinematiccreator.cinematic.viewer.Viewer;
import org.bukkit.Material;

public final class Scenario implements Cloneable {
    private Scenario() {}

    /**
     * Invoke this scenario.
     *
     * @param plugin The plugin instance.
     * @param viewer The viewer for the invoking.
     */
    public void invoke(CinematicCreator plugin, Viewer viewer) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Get the type of this scenario.
     *
     * @return The type of this scenario.
     */
    public static ScenarioType getType() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Get the value of this scenario.
     *
     * @return The value of this scenario.
     */
    public static String getValue() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Get the description of this scenario.
     *
     * @return The description of this scenario.
     */
    public static String getDescription() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Get the icon of this scenario.
     *
     * @return The icon of this scenario.
     */
    public static Material getIcon() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Get the delay of this scenario.
     *
     * @return The delay of this scenario.
     */
    public static long getDelay() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Set the delay of this scenario.
     *
     * @param delay The delay of this scenario.
     */
    public static void setDelay(long delay) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Clone this scenario.
     *
     * @return The cloned scenario.
     */
    public Scenario clone() {
        throw new ThisApiNotForImplementationException();
    }
}
