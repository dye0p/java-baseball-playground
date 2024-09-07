package baseball.model.domain;

import baseball.model.domain.util.BallCountor;
import baseball.model.domain.util.GameResultManager;
import baseball.model.domain.util.StrikeCountor;
import baseball.model.domain.util.StringToIntegerListConvertor;
import java.util.List;

public class Judge {
    private int strike;
    private int ball;

    private final StringToIntegerListConvertor convertor = new StringToIntegerListConvertor();
    private final StrikeCountor strikeCountor = new StrikeCountor();
    private final BallCountor ballCountor = new BallCountor();
    private final GameResultManager gameResultManager = new GameResultManager();

    public String calculateStrikeAndBall(String playerInputNumber, List<Integer> computerSecretNumber) {

        List<Integer> playerNumber = convertor.converte(playerInputNumber);

        strike = strikeCountor.countStrike(computerSecretNumber, playerNumber);
        ball = ballCountor.countBall(computerSecretNumber, playerNumber);

        return gameResultManager.gameResult(strike, ball);
    }

    public boolean isThreeStrike() {
        return strike == 3;
    }

}
