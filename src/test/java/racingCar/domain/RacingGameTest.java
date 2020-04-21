package racingCar.domain;

import org.junit.jupiter.api.BeforeAll;

import java.util.Arrays;
import java.util.List;


public class RacingGameTest {
    private static RacingGame racingGame;

    @BeforeAll
    static void setUp() {
        racingGame = new RacingGame();
    }
}
