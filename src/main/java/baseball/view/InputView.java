package baseball.view;

import java.util.Scanner;

public class InputView {
    private static final String INPUT_NUMBER_FORMAT = "숫자를 입력해 주세요 : ";
    private static final String CHOIC_GAME_STATUS_FORMAT = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public String inputRequest() {
        Scanner sc = new Scanner(System.in);
        System.out.print(INPUT_NUMBER_FORMAT);

        return sc.nextLine();
    }

    public String getGameStatusChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println(CHOIC_GAME_STATUS_FORMAT);

        return sc.nextLine();
    }
}
