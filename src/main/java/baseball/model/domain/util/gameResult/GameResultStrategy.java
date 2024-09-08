package baseball.model.domain.util.gameResult;

public interface GameResultStrategy {

    boolean isApplicable(int strike, int ball);

    String resultMessage(int strike, int ball);
}
