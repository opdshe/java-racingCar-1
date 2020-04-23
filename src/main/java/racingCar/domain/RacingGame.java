package racingCar.domain;

import racingCar.util.RandomCreator;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private List<Car> carEntries;

    public RacingGame(List<String> carNames) {
        createCarEntries(carNames);
    }

    private List<Car> createCarEntries(List<String> carNames) {
        carEntries = new ArrayList<>();
        carNames.forEach(carName -> carEntries.add(new Car(carName)));
        return carEntries;
    }

    public GameResult playOneCycle() {
        carEntries.forEach(car -> {
            car.go(RandomCreator.getRandomNum());
        });
        return new GameResult(carEntries);
    }

    public List<Car> getCarEntries() {
        return carEntries;
    }
}

