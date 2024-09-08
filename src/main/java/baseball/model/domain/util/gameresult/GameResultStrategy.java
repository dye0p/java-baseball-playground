package baseball.model.domain.util.gameresult;

public interface GameResultStrategy {

    boolean isApplicable(int strike, int ball);

    String resultMessage(int strike, int ball);
}
