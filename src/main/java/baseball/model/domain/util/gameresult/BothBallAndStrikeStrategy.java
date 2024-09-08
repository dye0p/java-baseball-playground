package baseball.model.domain.util.gameresult;

import baseball.enums.GameResultText;

public class BothBallAndStrikeStrategy implements GameResultStrategy {
    private static final String SPACE = " ";

    @Override
    public boolean isApplicable(int strike, int ball) {
        return ball >= 1 && strike >= 1;
    }

    @Override
    public String resultMessage(int strike, int ball) {
        return ball + GameResultText.BALL.getValue() + SPACE + strike + GameResultText.STRIKE.getValue();
    }
}
