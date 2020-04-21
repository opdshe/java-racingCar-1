package racingCar.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomCreatorTest {

    @Test
    void 랜덤넘버_생성_확인() {
        int randomNum = RandomCreator.getRandomNum();
        assertThat(randomNum).isBetween(0, 9);
    }

}