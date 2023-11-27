package dev.kafein.cinematiccreator;

import dev.kafein.cinematiccreator.cinematic.CinematicManager;

public final class CinematicCreatorAPI {
    private CinematicCreatorAPI() {
    }

    /**
     * @return CinematicCreator instance.
     */
    public static CinematicCreator getCinematicCreator() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * @return CinematicManager instance.
     */
    public static CinematicManager getCinematicManager() {
        throw new ThisApiNotForImplementationException();
    }
}
