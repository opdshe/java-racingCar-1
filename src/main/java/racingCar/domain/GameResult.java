package racingCar.domain;

import java.util.HashMap;

public class GameResult {
    private static HashMap<String, Car> carEntries;

    public GameResult(HashMap<String, Car> carEntries) {
        GameResult.carEntries = carEntries;
    }

    public HashMap<String, Car> getWinner() {
        HashMap<String, Car> winners = new HashMap<>();
        int maxDistance = getMaxDistance();
        carEntries.forEach((key, value) -> {
            if (value.getTravelDistance() == maxDistance) {
                winners.put(key, value);
            }
        });
        return winners;
    }

    private static int getMaxDistance() {
        return carEntries.values().stream()
                .mapToInt(Car::getTravelDistance)
                .max()
                .getAsInt();
    }

    public HashMap<String, Car> getCars() {
        return carEntries;
    }
}
