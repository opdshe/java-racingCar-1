package racingCar.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {
    private static RacingGame racingGame;

    @BeforeAll
    static void setUp() {
        racingGame = new RacingGame();
    }

    @Test
    void 랜덤넘버_생성_확인() {
        assertThat()
    }
}
