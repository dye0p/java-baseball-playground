package baseball.view;

import baseball.enums.ViewText;
import java.util.Scanner;

public class InputView {

    public String inputRequest() {
        Scanner sc = new Scanner(System.in);
        System.out.print(ViewText.INPUT_NUMBER_FORMAT.getValue());

        return sc.nextLine();
    }

    public int getGameStatusChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println(ViewText.CHOIC_GAME_STATUS_FORMAT.getValue());

        return sc.nextInt();
    }
}
