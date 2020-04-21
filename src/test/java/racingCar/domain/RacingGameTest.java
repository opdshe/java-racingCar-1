package racingCar.domain;

import org.junit.jupiter.api.Test;
import racingCar.domain.Car;


import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {
    @Test
    void 자동차_생성자_테스트() {
        assertThat(new Car("hotba"))
                .extracting("name").contains("hotba");
    }

    @Test
    void 자동차_이동로직_테스트() {
        Car myCar = new Car("hotba");
        Car.go(myCar, 3);
        assertThat(myCar.getTravelDistance()).isEqualTo(0);
        Car.go(myCar, 4);
        assertThat(myCar.getTravelDistance()).isEqualTo(1);
    }
}
