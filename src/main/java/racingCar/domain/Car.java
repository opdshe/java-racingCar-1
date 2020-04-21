package racingCar.domain;

public class Car {
    private static final int BENCHMARK = 4;

    private int travelDistance;

    public void go(int randomNum) {
        if (randomNum >= BENCHMARK) {
            this.travelDistance += 1;
        }
    }

    public int getTravelDistance() {
        return travelDistance;
    }
}