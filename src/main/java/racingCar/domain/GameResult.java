package racingCar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class GameResult {
    private List<Car> carEntries;

    public GameResult(List<Car> carEntries) {
        this.carEntries = carEntries;
    }

    public List<Car> getWinner() {
        int maxDistance = getMaxDistance();
        return carEntries.stream()
                .filter(car -> car.getTravelDistance() == maxDistance)
                .collect(Collectors.toList());
    }

    private int getMaxDistance() {
        return carEntries.stream()
                .mapToInt(Car::getTravelDistance)
                .max()
                .getAsInt();
    }

    public List<Car> getCars() {
        return carEntries;
    }
}
