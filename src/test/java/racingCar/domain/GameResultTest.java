package racingCar.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class GameResultTest {
    private static GameResult gameResult;

    @BeforeAll
    static void setup() {
        HashMap<String, Car> cars = new HashMap<>();
        List<String> carNames = Arrays.asList("hotba", "ford", "carpe");
        carNames.forEach(carName -> cars.put(carName, new Car()));
        gameResult = new GameResult(cars);
    }

    @Test
    void 우승자_찾기() {
        gameResult.getCars().get("hotba").go(5);
        gameResult.getCars().get("ford").go(5);
        assertThat(gameResult.getWinner()).containsOnlyKeys("hotba", "ford");
    }
}