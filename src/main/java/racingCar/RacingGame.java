package racingCar;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    protected static final int RANDOM_MAX = 9;
    protected static final int BENCHMARK = 4;

    public List<Car> run(List<String> carNames, int trial){
        List<Car>cars = new ArrayList<>();
        carNames.forEach(carName -> cars.add(new Car(carName)));
        for(int i = 0; i < trial; i++) {
            cars.forEach(Car::go);
        }
        return cars;
    }
}

class Car {
    private String name;
    private int travelDistance;

    public Car(String name) {
        this.name = name;
    }

    public static void go(Car car){
        int randomNum = (int) (Math.random() * RacingGame.RANDOM_MAX);
        if (randomNum >= RacingGame.BENCHMARK) {
            car.travelDistance += 1;
        }
    }
}