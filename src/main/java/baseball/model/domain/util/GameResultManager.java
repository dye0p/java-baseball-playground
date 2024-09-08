package baseball.model.domain.util;

public class GameResultManager {
    // TODO [2024/09/07] 상수들을 모두 Enum으로 관리할 수 있는지 고민
    private static final String STRIKE_TEXT = "스트라이크";
    private static final String BALL_TEXT = "볼";
    private static final String NOTHING_TEXT = "낫싱";
    private static final String SPACE = " ";

    // TODO [2024/09/07] 메서드 라인수 줄이기 고민
    public String gameResult(int strike, int ball) {
        StringBuilder result = new StringBuilder();

        if (isThreeStrike(strike)) {
            return formatThreeStrike(strike, result);
        }
        if (isBothBallAndStrike(strike, ball)) {
            return formatBallAndStrike(strike, ball, result);
        }
        if (isOnlyStrike(strike, ball)) {
            return formatOnlyStrike(strike, result);
        }
        if (isOnlyBall(strike, ball)) {
            return formatOnlyBall(ball, result);
        }
        return formayNothing(result);
    }

    private String formayNothing(StringBuilder result) {
        return result.append(NOTHING_TEXT).toString();
    }

    private String formatOnlyBall(int ball, StringBuilder result) {
        return result.append(ball).append(BALL_TEXT).toString();
    }

    private String formatOnlyStrike(int strike, StringBuilder result) {
        return result.append(strike).append(STRIKE_TEXT).toString();
    }

    private String formatBallAndStrike(int strike, int ball, StringBuilder result) {
        return result.append(ball).append(BALL_TEXT).append(SPACE).append(strike).append(STRIKE_TEXT).toString();
    }

    private String formatThreeStrike(int strike, StringBuilder result) {
        return result.append(strike).append(STRIKE_TEXT).toString();
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