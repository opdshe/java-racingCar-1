package racingCar.domain;

import racingCar.util.RandomCreator;
import racingCar.view.OutputView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RacingGame {

    public GameResult run(List<String> carNames, int trial) {
        Map<String, Car> carEntries = setCarEntries(carNames);
        for (int i = 0; i < trial; i++) {
            playOneCycle(carEntries);
        }
        return new GameResult(carEntries);
    }

    private static Map<String, Car> setCarEntries(List<String> carNames) {
        Map<String, Car> carEntries = new HashMap<>();
        carNames.forEach(carName -> carEntries.put(carName, new Car(carName)));
        return carEntries;
    }

    private static void playOneCycle(Map<String, Car> carEntries) {
        carEntries.forEach((key, value) -> {
            value.go(RandomCreator.getRandomNum());
        });
        OutputView.printCurrentDistance(carEntries);
        System.out.println();
    }
}

