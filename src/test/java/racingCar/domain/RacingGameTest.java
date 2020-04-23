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
        List<String> carNames = Arrays.asList("hotba", "ford", "carpe");
        racingGame = new RacingGame(carNames);
    }

    @Test
    void 자동차_리스트_생성_확인() {
        assertThat(racingGame.getCarEntries())
                .extracting("name")
                .containsOnly("hotba", "ford", "carpe");
    }

    @Test
    void 게임_한사이클_실행_확인() {
        racingGame.playOneCycle().getCars()
                .forEach(car -> {
                    assertThat(car.getTravelDistance())
                            .isBetween(0, 1);
                });
    }
}
