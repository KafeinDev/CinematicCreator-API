package dev.kafein.cinematiccreator.cinematic.viewer;

import dev.kafein.cinematiccreator.ThisApiNotForImplementationException;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.time.Duration;
import java.util.UUID;

public final class Viewer {
    private Viewer() {
    }

    /**
     * Returns the player who is watching the cinematic.
     *
     * @return The player who is watching the cinematic.
     */
    public Player getPlayer() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Returns the UUID of the viewer.
     *
     * @return The UUID of the viewer.
     */
    public UUID getUniqueId() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Returns the name of the viewer.
     *
     * @return The name of the viewer.
     */
    public String getName() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Returns the name of the cinematic to be watched.
     *
     * @return The name of the cinematic to be watched.
     */
    public String getTargetCinematic() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Returns the current frame position of the viewer.
     *
     * @return The current frame position of the viewer.
     */
    public int getTargetFramePosition() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Increments the current frame position of the viewer.
     */
    public void incrementTargetFramePosition() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Sets the current frame position of the viewer.
     *
     * @param position The current frame position of the viewer.
     */
    public void setTargetFramePosition(int position) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Sets the ready for next frame status of the viewer.
     *
     * @param readyForNextFrame The ready for next frame status of the viewer.
     */
    public void setReadyForNextFrame(boolean readyForNextFrame) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the finished status of the viewer.
     *
     * @return The finished status of the viewer.
     */
    public boolean isFinished() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Sets the finished status of the viewer.
     *
     * @param finished The finished status of the viewer.
     */
    public void setFinished(boolean finished) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the paused status of the viewer.
     *
     * @return The paused status of the viewer.
     */
    public boolean isPaused() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Sets the paused status of the viewer.
     *
     * @param paused The paused status of the viewer.
     */
    public void setPaused(boolean paused) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Pause scenarios and movement for the specified duration.
     *
     * @param pauseDuration The duration of the pause.
     */
    public void pauseAll(@NotNull Duration pauseDuration) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Pause movement for the specified duration.
     *
     * @param pauseDuration The duration of the pause.
     */
    public void pauseMovement(@NotNull Duration pauseDuration) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the movement pause duration.
     *
     * @return The movement pause duration.
     */
    public long getMovementPauseDuration() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the movement paused status.
     *
     * @return The movement paused status.
     */
    public boolean isMovementPaused() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Pause scenarios for the specified duration.
     *
     * @param scenariosPauseDuration The duration of the pause.
     */
    public void pauseScenarios(@NotNull Duration scenariosPauseDuration) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the scenarios pause duration.
     *
     * @return The scenarios pause duration.
     */
    public long getScenariosPauseDuration() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the scenarios paused status.
     *
     * @return The scenarios paused status.
     */
    public boolean isScenariosPaused() {
        throw new ThisApiNotForImplementationException();
    }
}
