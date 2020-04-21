package racingCar.domain;

import racingCar.util.RandomCreator;

import java.util.HashMap;
import java.util.List;

public class RacingGame {
    protected static final int BENCHMARK = 4;

    public GameResult run(List<String> carNames, int trial) {
        HashMap<String, Car> cars = new HashMap<>();
        carNames.forEach(carName -> cars.put(carName, new Car()));
        for (int i = 0; i < trial; i++) {
            cars.forEach((key, value) -> {
                int randomNum = RandomCreator.getRandomNum();
                value.go(randomNum);
            });
        }
        return new GameResult(cars);
    }
}

