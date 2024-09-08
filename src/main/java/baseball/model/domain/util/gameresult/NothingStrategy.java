package baseball.model.domain.util.gameresult;

public class NothingStrategy implements GameResultStrategy {
    private static final String NOTHING_TEXT = "낫싱";

    @Override
    public boolean isApplicable(int strike, int ball) {
        return ball == 0 && strike == 0;
    }

    @Override
    public String resultMessage(int strike, int ball) {
        return NOTHING_TEXT;
    }
}
