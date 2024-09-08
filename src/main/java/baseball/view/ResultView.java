package baseball.view;

import baseball.enums.ViewText;

public class ResultView {

    public void result(String result) {
        System.out.println(result);
    }

    public void endGame() {
        System.out.println(ViewText.GAME_WIN_MESSAGE_FORMAT.getValue());
    }
}
