package dev.kafein.cinematiccreator.event;

import dev.kafein.cinematiccreator.ThisApiNotForImplementationException;
import dev.kafein.cinematiccreator.cinematic.Cinematic;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * This event is called when a cinematic starts.
 * <p>
 * This event is called asynchronously.
 */
public final class CinematicStartEvent extends Event implements Cancellable {
    private CinematicStartEvent() {
    }

    /**
     * Returns the cinematic that is starting.
     *
     * @return the cinematic that is starting
     */
    public Cinematic getCinematic() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Returns the player that is watching the cinematic.
     *
     * @return the player that is watching the cinematic
     */
    public Player getPlayer() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Returns whether the event is cancelled.
     *
     * @return whether the event is cancelled
     */
    @Override
    public boolean isCancelled() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Sets whether the event is cancelled.
     *
     * @param cancel whether the event is cancelled
     */
    @Override
    public void setCancelled(boolean cancel) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Returns the handlers for this event.
     *
     * @return the handlers for this event
     */
    @Override
    public @NotNull HandlerList getHandlers() {
        throw new ThisApiNotForImplementationException();
    }
}
