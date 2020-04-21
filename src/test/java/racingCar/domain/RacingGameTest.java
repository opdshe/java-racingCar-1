package racingCar.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {
    private static RacingGame racingGame;

    @BeforeAll
    static void setUp() {
        racingGame = new RacingGame();
    }

    @Test
    void 자동차_게임_실행_확인() {
        List<String> carNames = Arrays.asList("hotba", "ford", "carpe");
        int trial = 5;
        assertThat(racingGame.run(carNames, trial).getCars().keySet())
                .isNotNull()
                .containsExactlyInAnyOrder("hotba", "ford", "carpe");
    }
}
