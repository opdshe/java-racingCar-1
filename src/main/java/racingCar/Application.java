package racingCar;

import racingCar.domain.GameResult;
import racingCar.view.InputView;
import racingCar.domain.RacingGame;
import racingCar.view.OutputView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> carNames = InputView.getCarNames();
        int trial = InputView.getTrial();

        RacingGame racingGame = new RacingGame(carNames);
        GameResult gameResult = null;

        System.out.println("\n실행 결과");
        for (int i = 0; i < trial; i++) {
            gameResult = racingGame.playOneCycle();
            OutputView.printOneCycle(gameResult);
        }
        OutputView.printWinners(gameResult.getWinner());
    }
}
