package dev.kafein.cinematiccreator.cinematic.scenario;

import dev.kafein.cinematiccreator.CinematicCreator;
import dev.kafein.cinematiccreator.cinematic.viewer.Viewer;
import org.bukkit.Material;

public interface Scenario extends Cloneable {
    /**
     * Invoke this scenario.
     *
     * @param plugin The plugin instance.
     * @param viewer The viewer for the invoking.
     */
    void invoke(CinematicCreator plugin, Viewer viewer);

    /**
     * Get the type of this scenario.
     *
     * @return The type of this scenario.
     */
    String getType();

    /**
     * Get the value of this scenario.
     *
     * @return The value of this scenario.
     */
    String getValue();

    /**
     * Get the description of this scenario.
     *
     * @return The description of this scenario.
     */
    String getDescription();

    /**
     * Get the icon of this scenario.
     *
     * @return The icon of this scenario.
     */
    Material getIcon();

    /**
     * Get the delay of this scenario.
     *
     * @return The delay of this scenario.
     */
    long getDelay();

    /**
     * Set the delay of this scenario.
     *
     * @param delay The delay of this scenario.
     */
    void setDelay(long delay);
}
