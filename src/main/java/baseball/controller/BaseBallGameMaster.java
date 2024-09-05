package baseball.controller;

import baseball.model.domain.Computer;
import baseball.view.InputView;

public class BaseBallGameMaster {

    private final InputView inputView;
    private final Computer computer;

    public BaseBallGameMaster() {
        this.computer = new Computer();
        this.inputView = new InputView();
    }

    public void startGame() {
        String input = inputView.inputRequest();
        String secretNumber = computer.createRandomNumber();
    }
}
