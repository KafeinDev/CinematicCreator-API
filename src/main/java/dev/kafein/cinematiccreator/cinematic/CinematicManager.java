package dev.kafein.cinematiccreator.cinematic;

import dev.kafein.cinematiccreator.ThisApiNotForImplementationException;
import dev.kafein.cinematiccreator.cinematic.viewer.Viewer;
import dev.kafein.cinematiccreator.cinematic.viewer.ViewerManager;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public final class CinematicManager {
    private CinematicManager() {
    }

    /**
     * Initializes the cinematic manager.
     * Loads all cinematics from the storage.
     * <p>
     * This method is called automatically when the plugin is enabled.
     * You don't need to call this method manually.
     */
    public void initialize() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Shuts down the cinematic manager.
     * Saves all cinematics to the storage.
     * <p>
     * This method is called automatically when the plugin is disabled.
     * You don't need to call this method manually.
     */
    public void shutdown() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Returns the cinematic with the given name.
     *
     * @param name the name of the cinematic
     * @return the cinematic with the given name
     */
    public void delete(@NotNull String name) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Deletes the given cinematic.
     *
     * @param cinematic the cinematic to delete
     */
    public void delete(@NotNull Cinematic cinematic) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Updates the given cinematic.
     *
     * @param name the name of the cinematic
     */
    public void update(@NotNull String name) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Updates the given cinematic.
     *
     * @param cinematic the cinematic to update
     */
    public void update(@NotNull Cinematic cinematic) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Creates a new cinematic with the given name.
     *
     * @param name the name of the cinematic
     * @return the created cinematic
     */
    public Cinematic create(@NotNull String name) {
        return Cinematic.create(name);
    }

    /**
     * Returns the map of all cinematics.
     *
     * @return the map of all cinematics
     */
    public Map<String, Cinematic> getMap() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Returns the cinematic with the given name.
     *
     * @param name the name of the cinematic
     * @return the cinematic with the given name
     */
    public Optional<Cinematic> find(@NotNull String name) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Puts the given cinematic to the map.
     *
     * @param name the name of the cinematic
     * @param cinematic the cinematic to put
     * @return the cinematic that is put
     */
    public Cinematic put(@NotNull String name, @NotNull Cinematic cinematic) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Removes the cinematic with the given name.
     *
     * @param name the name of the cinematic
     */
    public void remove(@NotNull String name) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Returns the viewer manager.
     *
     * @return the viewer manager
     */
    public ViewerManager getViewerManager() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Returns the map of all viewers.
     *
     * @return the map of all viewers
     */
    public Collection<Viewer> findAllViewers() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Returns the viewer with the given unique id.
     *
     * @param uniqueId the unique id of the viewer
     * @return the viewer with the given unique id
     */
    public Optional<Viewer> findViewer(@NotNull UUID uniqueId) {
        throw new ThisApiNotForImplementationException();
    }
}
