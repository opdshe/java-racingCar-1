package racingCar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingCar.interfaces.CarMovingStrategy;
import racingCar.util.RandomCreator;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {
    private static final int MUST_GO_NUMBER = 4;
    private static final int NEVER_GO_NUMBER = 3;
    private static RacingGame racingGame;

    @BeforeEach
    void setUp() {
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
    void 게임_한사이클_실행_무조건_정지_전략() {
        assertThat(racingGame.playOneCycle(new NeverGoStrategy()).getCars())
                .extracting(Car::getTravelDistance)
                .containsOnly(0);
    }

    @Test
    void 게임_한사이클_실행_무조건_이동_전략() {
        assertThat(racingGame.playOneCycle(new MustGoStrategy()).getCars())
                .extracting(Car::getTravelDistance)
                .containsOnly(1);
    }

    @Test
    void 게임_한사이클_실행_랜덤_전략() {
        assertThat(racingGame.playOneCycle(new RandomCreator()).getCars())
                .extracting(Car::getTravelDistance)
                .containsAnyOf(0,1);
    }

    private static class MustGoStrategy implements CarMovingStrategy {
        @Override
        public int generate() {
            return MUST_GO_NUMBER;
        }
    }

    private static class NeverGoStrategy implements CarMovingStrategy {
        @Override
        public int generate() {
            return NEVER_GO_NUMBER;
        }
    }
}
