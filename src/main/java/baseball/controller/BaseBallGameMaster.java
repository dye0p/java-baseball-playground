package baseball.controller;

import baseball.enums.GameOption;
import baseball.model.domain.Computer;
import baseball.model.domain.Game;
import baseball.model.domain.Judge;
import baseball.view.InputView;
import baseball.view.ResultView;
import java.util.List;

public class BaseBallGameMaster {

    private final InputView inputView;
    private final Game game;
    private final ResultView resultView;

    public BaseBallGameMaster() {
        this.game = Game.startGame();
        this.inputView = new InputView();
        this.resultView = new ResultView();
    }

    public void startGame() {
        while (!endGame()) {
            startRound();
            endRound();
        }
    }

    private boolean endGame() {
        return game.gameEnd();
    }

    private void startRound() {
        List<Integer> computerSecretNumber = new Computer().createRandomNumber();
        Judge judge;
        do {
            judge = new Judge();
            InputValidator inputValidator = new InputValidator();

            String playerInputNumber = inputView.inputRequest();
            inputValidator.validateInputNumber(playerInputNumber);

            String result = judge.calculateStrikeAndBall(playerInputNumber, computerSecretNumber);
            resultView.result(result);
        } while (!judge.isThreeStrike()); //3 스트라이크 나올때까지 반복
    }

    private void endRound() {
        resultView.endGame();
        int gameStatusChoice = inputView.getGameStatusChoice();

        if (isRestart(gameStatusChoice)) {
            startGame();
        }

        if (isEnd(gameStatusChoice)) {
            game.end();
        }
    }

    private boolean isEnd(int gameStatusChoice) {
        return gameStatusChoice == GameOption.END.getvalue();
    }

    private boolean isRestart(int gameStatusChoice) {
        return gameStatusChoice == GameOption.RESTART.getvalue();
    }
}
