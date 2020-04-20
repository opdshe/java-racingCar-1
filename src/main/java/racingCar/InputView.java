package racingCar;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);
    private static List<String> carNames;
    private static int trial;

    public static List<String> getCarNames(){
        setCarNames();
        return carNames;
    }

    public static int getTrial(){
        setTrial();
        return trial;
    }

    private static void setCarNames(){
        do {
            System.out.println("경주할 자동차 이름을  입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            String receivedCarNames = scanner.nextLine();
            carNames = Arrays.stream(receivedCarNames.split(","))
                    .map(String::trim)
                    .collect(Collectors.toList());
        } while (!Validator.checkCarNames(carNames));
    }

    private static void setTrial(){
        String uncheckedTrial;
        do{
            System.out.println("시도할 회수는 몇 회인가요?");
            uncheckedTrial = scanner.next();
        } while (!Validator.checkTrial(uncheckedTrial));
        trial=Integer.parseInt(uncheckedTrial);
    }
}
