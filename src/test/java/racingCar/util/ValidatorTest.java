package racingCar.util;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;

class ValidatorTest {
    private List<String> convertToList(String receivedCarNames) {
        return Arrays.stream(receivedCarNames.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
    }

    @Test
    void 자동차_이름_빈문자열_확인() {
        List<String> carNames = convertToList("\n");
        assertThat(Validator.validateCarNames(carNames)).isFalse();
    }

    @Test
    void 자동차_이름_길이_확인() {
        List<String> carNames = convertToList("overFive, sixLen");
        assertThat(Validator.validateCarNames(carNames)).isFalse();
    }

    @Test
    void 자동차_이름_값_존재_확인() {
        List<String> carNames = convertToList(",");
        assertThat(Validator.validateCarNames(carNames)).isFalse();
    }

    @Test
    void 시도_회수_타입_획인() {
        assertThat(Validator.validateTrial("숫자")).isFalse();
    }

    @Test
    void 시도_회수_범위_확인() {
        assertThat(Validator.validateTrial("0")).isFalse();
    }

}