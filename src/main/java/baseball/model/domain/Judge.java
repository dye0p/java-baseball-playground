package baseball.model.domain;

import baseball.model.domain.util.BallCountor;
import baseball.model.domain.util.StrikeCountor;
import baseball.model.domain.util.StringToIntegerListConvertor;
import java.util.List;

public class Judge {
    private static final String STRIKE_TEXT = "스트라이크";
    private static final String BALL_TEXT = "볼";
    private static final String NOTHING_TEXT = "낫싱";

    private int strike;
    private int ball;

    private final StringToIntegerListConvertor convertor = new StringToIntegerListConvertor();
    private final StrikeCountor strikeCountor = new StrikeCountor();
    private final BallCountor ballCountor = new BallCountor();

    public String calculateStrikeAndBall(String playerInputNumber, List<Integer> computerSecretNumber) {

        List<Integer> playerNumber = convertor.converte(playerInputNumber);

        strike = strikeCountor.countStrike(computerSecretNumber, playerNumber);
        ball = ballCountor.countBall(computerSecretNumber, playerNumber);

        return gameResult();
    }

    private String gameResult() {
        if (isThreeStrike()) {
            return strike + STRIKE_TEXT;
        }
        if (isBothBallAndStrike()) {
            return ball + BALL_TEXT + " " + strike + STRIKE_TEXT;
        }

        if (isOnlyStrike()) {
            return strike + STRIKE_TEXT;
        }

        if (isOnlyBall()) {
            return ball + BALL_TEXT;
        }

        return NOTHING_TEXT;
    }

    public boolean isThreeStrike() {
        return strike == 3;
    }

    private boolean isBothBallAndStrike() {
        return ball >= 1 && strike >= 1;
    }

    private boolean isOnlyStrike() {
        return ball == 0 && strike >= 1;
    }

    private boolean isOnlyBall() {
        return strike == 0 && ball >= 1;
    }
}
