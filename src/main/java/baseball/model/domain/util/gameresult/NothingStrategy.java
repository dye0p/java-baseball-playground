package baseball.model.domain.util.gameresult;

import baseball.model.domain.enums.GameResultText;

public class NothingStrategy implements GameResultStrategy {

    @Override
    public boolean isApplicable(int strike, int ball) {
        return ball == 0 && strike == 0;
    }

    @Override
    public String resultMessage(int strike, int ball) {
        return GameResultText.NOTHING.getValue();
    }
}
