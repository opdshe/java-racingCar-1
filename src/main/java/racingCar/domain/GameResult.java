package racingCar.domain;

import java.util.ArrayList;
import java.util.List;

public class GameResult {
    private List<Car> carEntries;

    public GameResult(List<Car> carEntries) {
        this.carEntries = carEntries;
    }

    public List<Car> getWinner() {
        List<Car> winners = new ArrayList<>();
        int maxDistance = getMaxDistance();
        carEntries.forEach(car -> {
            if (car.getTravelDistance() == maxDistance) {
                winners.add(car);
            }
        });
        return winners;
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
