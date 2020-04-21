package racingCar.domain;

import java.util.ArrayList;
import java.util.List;

public class GameResult {
    private static List<Car> cars;

    public GameResult(List<Car> cars) {
        GameResult.cars = cars;
    }

    public List<Car> getWiiner() {
        List<Car> winners = new ArrayList<>();
        int maxDistance = cars.stream().mapToInt(Car::getTravelDistance).max().getAsInt();
        cars.forEach(car ->{
            if (car.getTravelDistance()==maxDistance) {
                winners.add(car);
            }
        });
        return winners;
    }

    public List<Car> getCars() {
        return cars;
    }
}
