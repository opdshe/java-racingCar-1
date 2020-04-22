package racingCar.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class GameResultTest {
    private static GameResult gameResult;

    @BeforeAll
    static void setup() {
        List<Car> carEntries = new ArrayList<>();
        List<String> carNames = Arrays.asList("hotba", "ford", "carpe");
        carNames.forEach(carName -> carEntries.add(new Car(carName)));
        gameResult = new GameResult(carEntries);
    }

    @Test
    void 우승자_찾기() {
        gameResult.getCars().get(0).go(5);
        gameResult.getCars().get(1).go(5);
        assertThat(gameResult.getWinner())
                .extracting("name")
                .containsExactlyInAnyOrder("hotba", "ford");
    }
}