package racingCar;

import racingCar.domain.RacingGame;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> carNames = InputView.getCarNames();
        int trial = InputView.getTrial();
        RacingGame racingGame = new RacingGame();
        racingGame.run(carNames, trial);
    }
}
