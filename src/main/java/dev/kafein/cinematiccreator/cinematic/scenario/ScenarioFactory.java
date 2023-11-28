package dev.kafein.cinematiccreator.cinematic.scenario;

import dev.kafein.cinematiccreator.ThisApiNotForImplementationException;
import org.jetbrains.annotations.NotNull;

public final class ScenarioFactory {
    private ScenarioFactory() {}

    /**
     * Create a scenario with given type and value.
     *
     * @param type type of scenario
     * @param value value of scenario
     * @return created scenario
     */
    @NotNull
    public static Scenario createScenario(@NotNull ScenarioType type, @NotNull String value) {
        throw new ThisApiNotForImplementationException();
    }
}