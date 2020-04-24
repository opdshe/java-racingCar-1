package racingCar;

import racingCar.domain.Car;
import racingCar.domain.GameResult;
import racingCar.interfaces.CarMovingStrategy;
import racingCar.util.RandomCreator;
import racingCar.view.InputView;
import racingCar.domain.RacingGame;
import racingCar.view.OutputView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> carNames = InputView.getCarNames();
        int trial = InputView.getTrial();

        RacingGame racingGame = new RacingGame(carNames);
        CarMovingStrategy carMovingStrategy = new RandomCreator();
        GameResult gameResult = null;

        OutputView.belowIsResult();
        for (int i = 0; i < trial; i++) {
            gameResult = racingGame.playOneCycle(carMovingStrategy);
            OutputView.printOneCycle(gameResult);
        }
        OutputView.printWinners(gameResult.getWinner());
    }
}
