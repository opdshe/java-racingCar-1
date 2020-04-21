package racingCar.domain;

public class Car {
    private int travelDistance;

    public void go(int randomNum) {
        if (randomNum >= RacingGame.BENCHMARK) {
            this.travelDistance += 1;
        }
    }

    public int getTravelDistance() {
        return travelDistance;
    }
}