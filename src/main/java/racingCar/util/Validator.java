package racingCar.util;

import java.util.InputMismatchException;
import java.util.List;

public class Validator {
    private static final int MAX_NAME_LENGTH = 5;
    private static final int MIN_OF_TRIAL = 1;

    public static boolean validateCarNames(List<String> carNames) {
        try {
            checkCarNamesEmpty(carNames);
            carNames.forEach(carName -> {
                checkCarNameBlank(carName);
                checkCarNameLength(carName);
            });
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void checkCarNameBlank(String carName) throws IllegalArgumentException {
        if (carName.isBlank()) {
            throw new IllegalArgumentException("자동차 이름으로 빈 문자열을 사용할수 없습니다.");
        }
    }

    private static void checkCarNameLength(String carName) throws IllegalArgumentException {
        if (carName.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(carName + ": 자동차 이름은 다섯글자 이하만 가능합니다.");
        }
    }

    private static void checkCarNamesEmpty(List<String> carNames) {
        if (carNames.isEmpty()) {
            throw new IllegalArgumentException("입력값이 비어있습니다. ");
        }
    }

    public static boolean validateTrial(String uncheckedTrial) {
        try {
            checkTrialType(uncheckedTrial);
            checkTrialRange(uncheckedTrial);
        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void checkTrialType(String trial) throws InputMismatchException {
        for (int i = 0; i < trial.length(); i++) {
            if (!Character.isDigit(trial.charAt(i))) {
                throw new InputMismatchException("시도 회수는 숫자로 입력해야 합니다.");
            }
        }
    }

    private static void checkTrialRange(String trial) throws IllegalArgumentException {
        if (Integer.parseInt(trial) < MIN_OF_TRIAL) {
            throw new IllegalArgumentException("시도 회수는 1이상이어야 합니다.");
        }
    }
}