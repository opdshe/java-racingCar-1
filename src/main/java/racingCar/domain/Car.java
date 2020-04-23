package racingCar.domain;

public class Car {
    private static final int BENCHMARK = 4;

    private final String name;
    private int travelDistance;

    public Car(String name) {
        this.name = name;
    }

    public void go(int randomNum) {
        if (randomNum >= BENCHMARK) {
            this.travelDistance += 1;
        }
    }

    public String getName() {
        return name;
    }

    public int getTravelDistance() {
        return travelDistance;
    }
}