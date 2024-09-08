package baseball.model.domain.util.gameresult;

public class OnlyBallStrategy implements GameResultStrategy {
    private static final String BALL_TEXT = "볼";

    @Override
    public boolean isApplicable(int strike, int ball) {
        return strike == 0 && ball >= 1;
    }

    @Override
    public String resultMessage(int strike, int ball) {
        return ball + BALL_TEXT;
    }
}
