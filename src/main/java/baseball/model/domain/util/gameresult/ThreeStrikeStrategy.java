package baseball.model.domain.util.gameresult;

import baseball.model.domain.enums.GameResultText;

public class ThreeStrikeStrategy implements GameResultStrategy {

    @Override
    public boolean isApplicable(int strike, int ball) {
        return strike == 3;
    }

    @Override
    public String resultMessage(int strike, int ball) {
        return strike + GameResultText.STRIKE.getValue();
    }
}
