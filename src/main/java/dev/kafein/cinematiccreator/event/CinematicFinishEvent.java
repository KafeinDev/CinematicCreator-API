package dev.kafein.cinematiccreator.event;

import dev.kafein.cinematiccreator.ThisApiNotForImplementationException;
import dev.kafein.cinematiccreator.cinematic.Cinematic;
import dev.kafein.cinematiccreator.cinematic.viewer.Viewer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * This event is called when a cinematic is finished.
 * <p>
 * This event is called asynchronously.
 */
public final class CinematicFinishEvent extends Event implements Cancellable {
    private CinematicFinishEvent() {
    }

    /**
     * Returns the cinematic that is finished.
     *
     * @return the cinematic that is finished
     */
    public Cinematic getCinematic() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Returns the viewer that is watching the cinematic.
     *
     * @return the viewer that is watching the cinematic
     */
    public Viewer getViewer() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Returns whether this event is cancelled.
     *
     * @return whether this event is cancelled
     */
    @Override
    public boolean isCancelled() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Sets whether this event is cancelled.
     *
     * @param cancel whether this event is cancelled
     */
    @Override
    public void setCancelled(boolean cancel) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Returns the handlers of this event.
     *
     * @return the handlers of this event
     */
    @Override
    public @NotNull HandlerList getHandlers() {
        throw new ThisApiNotForImplementationException();
    }
}
