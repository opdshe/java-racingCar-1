package racingCar.domain;

import java.util.HashMap;

public class GameResult {
    private static HashMap<String, Car> cars;

    public GameResult(HashMap<String, Car> cars) {
        GameResult.cars = cars;
    }

    public HashMap<String, Car> getWinner() {
        HashMap<String, Car> winners = new HashMap<>();
        int maxDistance = cars.values().stream()
                .mapToInt(Car::getTravelDistance)
                .max()
                .getAsInt();
        cars.forEach((key, value) -> {
            if (value.getTravelDistance() == maxDistance) {
                winners.put(key, value);
            }
        });
        return winners;
    }

    public HashMap<String, Car> getCars() {
        return cars;
    }
}
