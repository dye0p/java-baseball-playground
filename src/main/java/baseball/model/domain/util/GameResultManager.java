package baseball.model.domain.util;

public class GameResultManager {
    private static final String STRIKE_TEXT = "스트라이크";
    private static final String BALL_TEXT = "볼";
    private static final String NOTHING_TEXT = "낫싱";

    public String gameResult(int strike, int ball) {
        if (isThreeStrike(strike)) {
            return strike + STRIKE_TEXT;
        }
        if (isBothBallAndStrike(strike, ball)) {
            return ball + BALL_TEXT + " " + strike + STRIKE_TEXT;
        }

        if (isOnlyStrike(strike, ball)) {
            return strike + STRIKE_TEXT;
        }

        if (isOnlyBall(strike, ball)) {
            return ball + BALL_TEXT;
        }

        return NOTHING_TEXT;
    }

    private boolean isThreeStrike(int strike) {
        return strike == 3;
    }

    private boolean isBothBallAndStrike(int strike, int ball) {
        return ball >= 1 && strike >= 1;
    }

    private boolean isOnlyStrike(int strike, int ball) {
        return ball == 0 && strike >= 1;
    }

    private boolean isOnlyBall(int strike, int ball) {
        return strike == 0 && ball >= 1;
    }
}