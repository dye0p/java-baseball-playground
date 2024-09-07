package baseball.model.domain;

import baseball.model.domain.util.BallCounter;
import baseball.model.domain.util.GameResultManager;
import baseball.model.domain.util.StrikeCounter;
import baseball.model.domain.util.StringToIntegerListConvertor;
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
        //3스트라이크가 나오면
        return strike == 3;
    }
}
