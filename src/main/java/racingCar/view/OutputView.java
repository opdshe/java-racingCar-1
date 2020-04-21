package racingCar.view;

import racingCar.domain.Car;

import java.util.HashMap;

public class OutputView {
    public static void printCurrentDistance(HashMap<String, Car> cars) {
        cars.forEach((key, value) -> {
            System.out.println(key + ": " + "-".repeat(value.getTravelDistance()));
        });
    }

    public static void printWinners(HashMap<String, Car> cars) {
        String winners = String.join(", ", cars.keySet());
        System.out.println(winners+ "가 우승했습니다.");
    }
}
