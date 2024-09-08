package baseball.model.domain;

import baseball.model.domain.util.GameResultManager;
import baseball.model.domain.util.StringToIntegerListConvertor;
import baseball.model.domain.util.calculator.BallCounter;
import baseball.model.domain.util.calculator.StrikeCounter;
import java.util.List;

public class Judge {

    private int strike;
    private int ball;

    public String calculateStrikeAndBall(String playerInputNumber, List<Integer> computerSecretNumber) {

        StrikeCounter strikeCountor = new StrikeCounter();
        BallCounter ballCountor = new BallCounter();
        GameResultManager gameResultManager = new GameResultManager();

        List<Integer> playerNumber = convertToIntegerList(playerInputNumber);

        strike = strikeCountor.countStrikeAndBall(computerSecretNumber, playerNumber);
        ball = ballCountor.countStrikeAndBall(computerSecretNumber, playerNumber);

        return gameResultManager.gameResult(strike, ball);
    }

    private List<Integer> convertToIntegerList(String playerInputNumber) {
        StringToIntegerListConvertor convertor = new StringToIntegerListConvertor();
        return convertor.converte(playerInputNumber);
    }

    public boolean isThreeStrike() {
        // TODO [2024/09/07] 3스트라이크 게임종료 고민
        return strike == 3;
    }
}
