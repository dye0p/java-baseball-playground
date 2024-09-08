package baseball.model.domain.util.gameresult;

import baseball.model.domain.enums.GameResultText;

public class OnlyBallStrategy implements GameResultStrategy {

    @Override
    public boolean isApplicable(int strike, int ball) {
        return strike == 0 && ball >= 1;
    }

    @Override
    public String resultMessage(int strike, int ball) {
        return ball + GameResultText.BALL.getValue();
    }
}
