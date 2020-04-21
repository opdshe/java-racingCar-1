package racingCar.domain;

import java.util.HashMap;
import java.util.Map;

public class GameResult {
    private Map<String, Car> carEntries;

    public GameResult(Map<String, Car> carEntries) {
        this.carEntries = carEntries;
    }

    public Map<String, Car> getWinner() {
        Map<String, Car> winners = new HashMap<>();
        int maxDistance = getMaxDistance();
        carEntries.forEach((key, value) -> {
            if (value.getTravelDistance() == maxDistance) {
                winners.put(key, value);
            }
        });
        return winners;
    }

    private int getMaxDistance() {
        return carEntries.values().stream()
                .mapToInt(Car::getTravelDistance)
                .max()
                .getAsInt();
    }

    public Map<String, Car> getCars() {
        return carEntries;
    }
}
