package racingCar.util;

public class RandomCreator {
    private static final int RANDOM_MAX = 9;

    public static int getRandomNum() {
        return (int) (Math.random() * RANDOM_MAX);
    }
}
