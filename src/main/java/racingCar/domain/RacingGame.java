package racingCar.domain;

import racingCar.util.RandomCreator;
import racingCar.view.OutputView;

import java.util.HashMap;
import java.util.List;

public class RacingGame {

    public GameResult run(List<String> carNames, int trial) {
        HashMap<String, Car> carEntries = setCarEntries(carNames);
        for (int i = 0; i < trial; i++) {
            playOneCycle(carEntries, trial);
        }
        return new GameResult(carEntries);
    }

    private static HashMap<String, Car> setCarEntries(List<String> carNames) {
        HashMap<String, Car> carEntries = new HashMap<>();
        carNames.forEach(carName -> carEntries.put(carName, new Car()));
        return carEntries;
    }

    private static void playOneCycle(HashMap<String, Car> carEntries, int trial) {
        carEntries.forEach((key, value) -> {
            value.go(RandomCreator.getRandomNum());
        });
        OutputView.printCurrentDistance(carEntries);
        System.out.println();
    }
}

