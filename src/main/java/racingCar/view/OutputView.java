package racingCar.view;

import racingCar.domain.Car;
import racingCar.domain.GameResult;

import java.util.List;
import java.util.stream.Collectors;


public class OutputView {
    public static void printOneCycle(GameResult gameResult) {
        gameResult.getCars().forEach(car -> {
            System.out.println(car.getName() + ": " + "-".repeat(car.getTravelDistance()));
        });
        System.out.println();
    }

    public static void printWinners(List<Car> cars) {
        String winners = cars.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));
        System.out.println(winners + "가 우승했습니다.");
    }
}
