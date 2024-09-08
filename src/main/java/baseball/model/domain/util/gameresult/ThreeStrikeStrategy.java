package baseball.model.domain.util.gameresult;

public class ThreeStrikeStrategy implements GameResultStrategy {
    private static final String STRIKE_TEXT = "스트라이크";

    @Override
    public boolean isApplicable(int strike, int ball) {
        return strike == 3;
    }

    @Override
    public String resultMessage(int strike, int ball) {
        return strike + STRIKE_TEXT;
    }
}
