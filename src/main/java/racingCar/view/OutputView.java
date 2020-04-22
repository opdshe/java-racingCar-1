package racingCar.view;

import racingCar.domain.Car;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.String.join;

public class OutputView {
    public static void printCurrentDistance(List<Car> cars) {
        cars.forEach(car -> {
            System.out.println(car.getName() + ": " + "-".repeat(car.getTravelDistance()));
        });
    }

    public static void printWinners(List<Car> cars) {
        String winners = cars.stream().map(Car::getName).collect(Collectors.joining(", "));
        System.out.println(winners + "가 우승했습니다.");
    }
}
