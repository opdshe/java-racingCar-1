package racingCar.view;

import racingCar.domain.Car;

import java.util.Map;

public class OutputView {
    public static void printCurrentDistance(Map<String, Car> cars) {
        cars.forEach((key, value) -> {
            System.out.println(key + ": " + "-".repeat(value.getTravelDistance()));
        });
    }

    public static void printWinners(Map<String, Car> cars) {
        String winners = String.join(", ", cars.keySet());
        System.out.println(winners + "가 우승했습니다.");
    }
}
