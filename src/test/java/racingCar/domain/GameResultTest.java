package racingCar.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class GameResultTest {
    private static GameResult gameResult;

    @BeforeAll
    public static void setup() {
        List<Car> cars = Arrays
                .asList(new Car("hotba"), new Car("pio"), new Car("ford"));
        gameResult = new GameResult(cars);
    }

    @Test
    void 우승자_찾기(){
        gameResult.getCars().get(0).go( 5);
        gameResult.getCars().get(1).go( 5);
        assertThat(gameResult.getWiiner()).extracting("name").contains("hotba", "pio");
    }
}