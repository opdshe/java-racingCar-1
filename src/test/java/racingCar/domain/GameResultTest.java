package racingCar.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class GameResultTest {
    private static GameResult gameResult;

    @Test
    void 우승자_찾기() {
        List<Car> carEntries = new ArrayList<>();
        List<String> carNames = Arrays.asList("hotba", "ford", "carpe");
        carNames.forEach(carName -> carEntries.add(new Car(carName)));
        carEntries.get(0).go(4);
        carEntries.get(1).go(4);

        gameResult = new GameResult(carEntries);
        assertThat(gameResult.getWinner())
                .extracting("name")
                .containsExactlyInAnyOrder("hotba", "ford");
    }
}