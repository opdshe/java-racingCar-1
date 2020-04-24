package racingCar.util;

import racingCar.interfaces.CarMovingStrategy;

public class RandomCreator implements CarMovingStrategy {
    private static final int RANDOM_MAX = 9;

    @Override
    public int generate() {
        return (int) (Math.random() * RANDOM_MAX);
    }
}
