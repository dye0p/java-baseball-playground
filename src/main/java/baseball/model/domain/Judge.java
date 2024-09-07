package baseball.model.domain;

import baseball.model.domain.util.StringToIntegerListConvertor;
import java.util.List;
import java.util.stream.IntStream;

public class Judge {
    private static final int MIM_RANGE = 0;
    private static final int MAX_RANGE = 3;
    private static final String STRIKE_TEXT = "스트라이크";
    private static final String BALL_TEXT = "볼";
    private static final String NOTHING_TEXT = "낫싱";

    private int strike;
    private int ball;
    private final StringToIntegerListConvertor convertor = new StringToIntegerListConvertor();

    public String calculateStrikeAndBall(String playerInputNumber, List<Integer> computerSecretNumber) {

        List<Integer> playerNumber = convertor.converte(playerInputNumber);

        strike = countStrike(computerSecretNumber, playerNumber);
        ball = countBall(computerSecretNumber, playerNumber);

        return gameResult();
    }

    private String gameResult() {
        if (isThreeStrike()) {
            return strike + STRIKE_TEXT;
        }
        if (isBothBallAndStrike()) {
            return ball + BALL_TEXT + " " + strike + STRIKE_TEXT;
        }

        if (isOnlyStrike()) {
            return strike + STRIKE_TEXT;
        }

        if (isOnlyBall()) {
            return ball + BALL_TEXT;
        }

        return NOTHING_TEXT;
    }

    public boolean isThreeStrike() {
        return strike == 3;
    }

    private boolean isBothBallAndStrike() {
        return ball >= 1 && strike >= 1;
    }

    private boolean isOnlyStrike() {
        return ball == 0 && strike >= 1;
    }

    private boolean isOnlyBall() {
        return strike == 0 && ball >= 1;
    }

    private int countStrike(List<Integer> computerSecretNumber, List<Integer> playerNumber) {
        return (int) IntStream.range(MIM_RANGE, MAX_RANGE)
                .filter(i -> computerSecretNumber.get(i).equals(playerNumber.get(i)))
                .count();
    }

    private int countBall(List<Integer> computerSecretNumber, List<Integer> playerNumber) {
        return (int) IntStream.range(MIM_RANGE, MAX_RANGE)
                .filter(i -> !computerSecretNumber.get(i).equals(playerNumber.get(i)))
                .flatMap(i -> IntStream.range(MIM_RANGE, MAX_RANGE)
                        .filter(j -> computerSecretNumber.get(i).equals(playerNumber.get(j))))
                .count();
    }
}
