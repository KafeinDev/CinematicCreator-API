package dev.kafein.cinematiccreator.cinematic;

import dev.kafein.cinematiccreator.ThisApiNotForImplementationException;
import dev.kafein.cinematiccreator.cinematic.frame.Frame;
import dev.kafein.cinematiccreator.cinematic.scenario.ScenarioProvider;
import dev.kafein.cinematiccreator.cinematic.viewer.Viewer;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public final class Cinematic extends ScenarioProvider
        implements Cloneable {
    private Cinematic() {
    }

    /**
     * Creates a new cinematic.
     *
     * @param name The name of the cinematic.
     * @return The created cinematic.
     */
    @NotNull
    public static Cinematic create(@NotNull String name) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Starts the cinematic for the player.
     *
     * @param player The player to start the cinematic.
     * @param cinematic The cinematic to start.
     */
    public void start(@NotNull Player player, @NotNull Cinematic cinematic) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Stops the cinematic for the player.
     *
     * @param player The player to stop the cinematic.
     * @param cinematic The cinematic to stop.
     */
    public void finish(@NotNull Player player, @NotNull Cinematic cinematic) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the name of the cinematic.
     *
     * @return The name of the cinematic.
     */
    public String getName() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the visibility of the cinematic in the cinematic menu.
     *
     * @return The visibility of the cinematic in the cinematic menu.
     */
    public boolean isVisibleInCinematicsMenu() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Sets the visibility of the cinematic in the cinematic menu.
     *
     * @param visible The visibility of the cinematic in the cinematic menu.
     */
    public void setVisibleInCinematicsMenu(boolean visible) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the attachment of the pumpkin to the player's head.
     *
     * @return The attachment of the pumpkin to the player's head.
     */
    public boolean isAttachPumpkin() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Sets the attachment of the pumpkin to the player's head.
     *
     * @param attachPumpkin The attachment of the pumpkin to the player's head.
     */
    public void setAttachPumpkin(boolean attachPumpkin) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the hide of the players when the cinematic is started.
     *
     * @return The hide of the players when the cinematic is started.
     */
    public boolean isHidePlayers() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Sets the hide of the players when the cinematic is started.
     *
     * @param hidePlayers The hide of the players when the cinematic is started.
     */
    public void setHidePlayers(boolean hidePlayers) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the hide of the entities when the cinematic is started.
     *
     * @return The hide of the entities when the cinematic is started.
     */
    public boolean isHideEntities() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Sets the hide of the entities when the cinematic is started.
     *
     * @param hideEntities The hide of the entities when the cinematic is started.
     */
    public void setHideEntities(boolean hideEntities) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the speed of the cinematic.
     *
     * @return The speed of the cinematic.
     */
    public double getSpeed() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Sets the speed of the cinematic.
     *
     * @param speed The speed of the cinematic.
     */
    public void setSpeed(double speed) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the fov of the cinematic.
     *
     * @return The fov of the cinematic.
     */
    public double getFov() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Sets the fov of the cinematic.
     *
     * @param fov The fov of the cinematic.
     */
    public void setFov(double fov) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the camera locked for the viewers.
     *
     * @return The camera locked for the viewers.
     */
    public boolean isCameraLocked() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Sets the camera locked for the viewers.
     *
     * @param cameraLocked The camera locked for the viewers.
     */
    public void setCameraLocked(boolean cameraLocked) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the frames of the cinematic.
     *
     * @return The frames of the cinematic.
     */
    public List<Frame> findAllFrames() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the frame of the cinematic by priority.
     *
     * @param priority The priority of the frame.
     * @return The frame of the cinematic by priority.
     */
    public Optional<Frame> findFrameByPriority(int priority) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Puts the frames to the cinematic.
     *
     * @param frames The frames to put.
     */
    public void putFrames(@NotNull Collection<Frame> frames) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Puts the frame to the cinematic.
     *
     * @param frame The frame to put.
     */
    public void putFrame(@NotNull Frame frame) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Moves the frame via priority.
     *
     * @param frame The frame to move.
     * @param priority The priority to move.
     */
    public void moveFrame(@NotNull Frame frame, int priority) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Removes the frame from the cinematic.
     *
     * @param frame The frame to remove.
     */
    public void removeFrame(@NotNull Frame frame) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Removes the frame from the cinematic without sort.
     *
     * @param frame The frame to remove.
     */
    public void removeFrameWithoutSort(@NotNull Frame frame) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the frame count of the cinematic.
     *
     * @return The frame count of the cinematic.
     */
    public int getFrameCount() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the viewers of the cinematic.
     *
     * @return The viewers of the cinematic.
     */
    public Map<UUID, Viewer> getViewers() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the viewer of the cinematic by player.
     *
     * @param player The player to get the viewer.
     * @return The viewer of the cinematic by player.
     */
    public Optional<Viewer> findViewer(@NotNull Player player) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the viewer of the cinematic by unique id.
     *
     * @param uuid The unique id to get the viewer.
     * @return The viewer of the cinematic by unique id.
     */
    public Optional<Viewer> findViewerByUniqueId(@NotNull UUID uuid) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Puts the viewer to the cinematic.
     *
     * @param viewer The viewer to put.
     */
    public void putViewer(@NotNull UUID uniqueId, @NotNull Viewer viewer) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Removes the viewer from the cinematic.
     *
     * @param uniqueId The unique id to remove the viewer.
     * @return The removed viewer from the cinematic.
     */
    public Viewer removeViewer(@NotNull UUID uniqueId) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the viewer count of the cinematic.
     *
     * @return The viewer count of the cinematic.
     */
    public int getViewerCount() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Gets the estimated time of the cinematic.
     *
     * @return The estimated time of the cinematic.
     */
    public long getEstimatedTime() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Sets the estimated time of the cinematic.
     *
     * @param estimatedTime The estimated time of the cinematic.
     */
    public void setEstimatedTime(long estimatedTime) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Clones the cinematic.
     *
     * @return The cloned cinematic.
     */
    @Override
    public Cinematic clone() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Clones the cinematic with the name.
     *
     * @param name The name of the cloned cinematic.
     * @return The cloned cinematic with the name.
     */
    public Cinematic clone(@NotNull String name) {
        throw new ThisApiNotForImplementationException();
    }
}
