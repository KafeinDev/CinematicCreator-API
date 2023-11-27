package dev.kafein.cinematiccreator;

import dev.kafein.cinematiccreator.cinematic.CinematicManager;

public final class CinematicCreator {
    private CinematicCreator() {
    }

    /**
     * @return CinematicManager instance.
     */
    public static CinematicManager getCinematicManager() {
        throw new ThisApiNotForImplementationException();
    }
}
