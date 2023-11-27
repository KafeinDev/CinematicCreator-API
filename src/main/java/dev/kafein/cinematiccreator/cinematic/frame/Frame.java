package dev.kafein.cinematiccreator.cinematic.frame;

import dev.kafein.cinematiccreator.ThisApiNotForImplementationException;
import dev.kafein.cinematiccreator.cinematic.scenario.ScenarioProvider;
import org.bukkit.Location;
import org.jetbrains.annotations.NotNull;

public final class Frame extends ScenarioProvider
        implements Cloneable {
    private Frame() {
    }

    /**
     * Create a new frame.
     *
     * @param cinematicName The name of the cinematic.
     * @param priority      The priority of the frame.
     * @return The created frame.
     */
    public static Frame create(@NotNull String cinematicName, int priority, @NotNull Location location) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Create a new frame.
     *
     * @param cinematicName     The name of the cinematic.
     * @param priority          The priority of the frame.
     * @param location          The location of the frame.
     * @param teleportNextFrame Whether to teleport the player to the location of the
     *                          next frame.
     * @return The created frame.
     */
    public static Frame create(@NotNull String cinematicName, int priority, @NotNull Location location, boolean teleportNextFrame) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Get the name of the cinematic.
     *
     * @return The name of the cinematic.
     */
    public String getCinematicName() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Get the priority of the frame.
     *
     * @return The priority of the frame.
     */
    public int getPriority() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Get the location of the frame.
     *
     * @return The location of the frame.
     */
    public Location getLocationBukkit() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets whether to teleport the player to the location of the next frame.
     *
     * @return Whether to teleport the player to the location of the next frame.
     */
    public boolean isTeleportNextFrame() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Sets whether to teleport the player to the location of the next frame.
     *
     * @param teleportNextFrame Whether to teleport the player to the location of the next frame.
     *
     */
    public void setTeleportNextFrame(boolean teleportNextFrame) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Clone the frame.
     *
     * @return The cloned frame.
     */
    @Override
    public Frame clone() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Clone the frame.
     *
     * @param priority The priority of the frame.
     * @return The cloned frame.
     */
    public Frame clone(int priority) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Clone the frame.
     *
     * @param location The location of the frame.
     * @return The cloned frame.
     */
    public Frame clone(@NotNull Location location) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Clone the frame.
     *
     * @param priority The priority of the frame.
     * @param location The location of the frame.
     * @return The cloned frame.
     */
    public Frame clone(int priority, @NotNull Location location) {
        throw new ThisApiNotForImplementationException();
    }
}
