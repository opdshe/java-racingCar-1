package racingCar.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    protected static final int RANDOM_MAX = 9;
    protected static final int BENCHMARK = 4;

    public GameResult run(List<String> carNames, int trial) {
        List<Car> cars = new ArrayList<>();
        carNames.forEach(carName -> cars.add(new Car(carName)));
        for (int i = 0; i < trial; i++) {
            cars.forEach(car -> {
                int randomNum = getRandomNum();
                car.go(randomNum);
            });
        }

        return new GameResult(cars);
    }

    private static int getRandomNum() {
        return (int) (Math.random() * RacingGame.RANDOM_MAX);
    }
}

