package baseball.model.domain.util;

public class GameResultManager {
    private static final String STRIKE_TEXT = "스트라이크";
    private static final String BALL_TEXT = "볼";
    private static final String NOTHING_TEXT = "낫싱";
    private static final String SPACE = " ";

    public String gameResult(int strike, int ball) {
        StringBuilder result = new StringBuilder();

        if (isThreeStrike(strike)) {
            return result.append(strike).append(STRIKE_TEXT).toString();
        }
        if (isBothBallAndStrike(strike, ball)) {
            return result.append(ball).append(BALL_TEXT).append(SPACE).append(strike).append(STRIKE_TEXT).toString();
        }

        if (isOnlyStrike(strike, ball)) {
            return result.append(strike).append(STRIKE_TEXT).toString();
        }

        if (isOnlyBall(strike, ball)) {
            return result.append(ball).append(BALL_TEXT).toString();
        }

        return result.append(NOTHING_TEXT).toString();
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