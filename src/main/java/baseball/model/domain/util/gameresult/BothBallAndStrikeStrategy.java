package baseball.model.domain.util.gameresult;

public class BothBallAndStrikeStrategy implements GameResultStrategy {
    private static final String STRIKE_TEXT = "스트라이크";
    private static final String BALL_TEXT = "볼";
    private static final String SPACE = " ";

    @Override
    public boolean isApplicable(int strike, int ball) {
        return ball >= 1 && strike >= 1;
    }

    @Override
    public String resultMessage(int strike, int ball) {
        return ball + BALL_TEXT + SPACE + strike + STRIKE_TEXT;
    }
}
