package racingCar.domain;

public class Car {
    private String name;
    private int travelDistance;

    public Car(String name) {
        this.name = name;
    }

    public void go(int randomNum) {
        if (randomNum >= RacingGame.BENCHMARK) {
            this.travelDistance += 1;
        }
    }

    public int getTravelDistance() {
        return travelDistance;
    }
}