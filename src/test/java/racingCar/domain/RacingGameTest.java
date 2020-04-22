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
    void 자동차_리스트_생성_확인() {
        List<String> carNames = Arrays.asList("hotba", "ford", "carpe");
        assertThat(racingGame.run(carNames, 5).getCars())
                .extracting("name")
                .containsOnly("hotba", "ford", "carpe");
    }
}
