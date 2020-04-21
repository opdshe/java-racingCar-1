package racingCar;

import racingCar.domain.GameResult;
import racingCar.view.InputView;
import racingCar.domain.RacingGame;
import racingCar.view.OutputView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        RacingGame racingGame = new RacingGame();
        List<String> carNames = InputView.getCarNames();
        int trial = InputView.getTrial();
        GameResult gameResult = racingGame.run(carNames, trial);
        OutputView.printWinners(gameResult.getWinner());
    }
}
