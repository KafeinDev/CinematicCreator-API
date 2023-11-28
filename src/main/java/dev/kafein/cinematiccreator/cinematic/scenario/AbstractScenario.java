package dev.kafein.cinematiccreator.cinematic.scenario;

import org.jetbrains.annotations.NotNull;

public abstract class AbstractScenario implements Scenario {
    private final @NotNull String value;

    private long delay;

    protected AbstractScenario(@NotNull String value) {
        this.value = value;
    }

    @Override
    public @NotNull String getValue() {
        return this.value;
    }

    @Override
    public long getDelay() {
        return this.delay;
    }

    @Override
    public void setDelay(long delay) {
        this.delay = delay;
    }
}