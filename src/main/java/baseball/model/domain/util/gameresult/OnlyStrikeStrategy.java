package baseball.model.domain.util.gameresult;

import baseball.enums.GameResultText;

public class OnlyStrikeStrategy implements GameResultStrategy {

    @Override
    public boolean isApplicable(int strike, int ball) {
        return ball == 0 && strike >= 1;
    }

    @Override
    public String resultMessage(int strike, int ball) {
        return strike + GameResultText.STRIKE.getValue();
    }
}
