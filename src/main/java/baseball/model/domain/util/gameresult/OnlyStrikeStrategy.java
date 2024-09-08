package baseball.model.domain.util.gameresult;

public class OnlyStrikeStrategy implements GameResultStrategy {
    private static final String STRIKE_TEXT = "스트라이크";

    @Override
    public boolean isApplicable(int strike, int ball) {
        return ball == 0 && strike >= 1;
    }

    @Override
    public String resultMessage(int strike, int ball) {
        return strike + STRIKE_TEXT;
    }
}
