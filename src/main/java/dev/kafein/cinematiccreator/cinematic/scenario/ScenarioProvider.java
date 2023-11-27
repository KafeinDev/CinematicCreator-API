package dev.kafein.cinematiccreator.cinematic.scenario;

import dev.kafein.cinematiccreator.ThisApiNotForImplementationException;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public abstract class ScenarioProvider {
    /**
     * Get the scenario map.
     *
     * @return The scenario map.
     */
    public Map<Integer, Scenario> getScenarios() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Clone the scenario map.
     *
     * @return The cloned scenario map.
     */
    public Map<Integer, Scenario> cloneScenarios() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Get the scenario list.
     *
     * @return The scenario list.
     */
    public List<Scenario> findAllScenarios() {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Get the scenario.
     *
     * @param priority The priority of the scenario.
     * @return The scenario.
     */
    public Optional<Scenario> findScenario(int priority) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Puts the scenario map.
     *
     * @param scenarios The scenario map.
     */
    public void putScenarios(@NotNull Map<Integer, Scenario> scenarios) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Puts a scenario.
     *
     * @param scenario The scenario.
     */
    public void putScenario(@NotNull Scenario scenario) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Puts a scenario.
     *
     * @param priority The priority of the scenario.
     * @param scenario The scenario.
     */
    public void putScenario(int priority, @NotNull Scenario scenario) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Move the scenario.
     *
     * @param from The priority of the scenario to move.
     * @param to The priority of the scenario to move.
     */
    public void moveScenario(int from, int to) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Remove the scenario.
     *
     * @param priority The priority of the scenario to remove.
     */
    public void removeScenario(int priority) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Remove the scenario without sort.
     *
     * @param priority The priority of the scenario to remove.
     */
    public void removeScenarioWithoutSort(int priority) {
        throw new ThisApiNotForImplementationException();
    }

    /**
     * Get the scenario count.
     *
     * @return The scenario count.
     */
    public int getScenarioCount() {
        throw new ThisApiNotForImplementationException();
    }
}
