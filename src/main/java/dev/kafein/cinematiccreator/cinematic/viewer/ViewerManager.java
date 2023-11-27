package dev.kafein.cinematiccreator.cinematic.viewer;

import dev.kafein.cinematiccreator.ThisApiNotForImplementationException;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public final class ViewerManager {
    private ViewerManager() {
    }

    /**
     * Creates a new viewer.
     *
     * @param player The player who will watch the cinematic.
     * @param targetCinematic The name of the cinematic to be watched.
     * @return The created viewer.
     */
    public Viewer create(@NotNull Player player, @NotNull String targetCinematic) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Loads a viewer from the storage.
     *
     * @param player The player who will watch the cinematic.
     * @return The loaded viewer.
     */
    public CompletableFuture<Viewer> load(@NotNull Player player) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Saves a viewer to the storage.
     *
     * @param viewer The viewer to be saved.
     * @return A completable future.
     */
    public CompletableFuture<Void> save(@NotNull Viewer viewer) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Deletes a viewer from the storage.
     *
     * @param uuid The UUID of the viewer to be deleted.
     * @return A completable future.
     */
    public CompletableFuture<Void> delete(@NotNull UUID uuid) {
        throw new ThisApiNotForImplementationException();
    }
}
