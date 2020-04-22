package racingCar.domain;

import racingCar.util.RandomCreator;
import racingCar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    public GameResult run(List<String> carNames, int trial) {
        List<Car> carEntries = setCarEntries(carNames);
        for (int i = 0; i < trial; i++) {
            playOneCycle(carEntries);
        }
        return new GameResult(carEntries);
    }

    private static List<Car> setCarEntries(List<String> carNames) {
        List<Car> carEntries = new ArrayList<>();
        carNames.forEach(carName -> carEntries.add(new Car(carName)));
        return carEntries;
    }

    private static void playOneCycle(List<Car> carEntries) {
        carEntries.forEach(car -> {
            car.go(RandomCreator.getRandomNum());
        });
        OutputView.printCurrentDistance(carEntries);
        System.out.println();
    }
}

