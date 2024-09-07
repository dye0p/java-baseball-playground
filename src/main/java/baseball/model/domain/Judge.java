package baseball.model.domain;

import baseball.model.domain.util.StringToIntegerListConvertor;
import java.util.List;
import java.util.stream.IntStream;

public class Judge {

    private int strike;
    private int ball;
    private String result;

    private final StringToIntegerListConvertor convertor = new StringToIntegerListConvertor();

    public String calculateStrikeAndBall(String playerInputNumber, List<Integer> computerSecretNumber) {

        List<Integer> playerNumber = convertor.converte(playerInputNumber);

        strike = (int) IntStream.range(0, 3)
                .filter(i -> computerSecretNumber.get(i).equals(playerNumber.get(i)))
                .count();

        ball = (int) IntStream.range(0, 3)
                .filter(i -> !computerSecretNumber.get(i).equals(playerNumber.get(i)))
                .flatMap(i -> IntStream.range(0, 3)
                        .filter(j -> computerSecretNumber.get(i).equals(playerNumber.get(j))))
                .count();

        if (ball >= 1 && strike >= 1) {
            result = ball + "볼" + " " + strike + "스트라이크";
        }

        if (ball == 0 && strike >= 1) {
            result = strike + "스트라이크";
        }

        if (strike == 0 && ball >= 1) {
            result = ball + "볼";
        }

        if (strike == 3) {
            result = strike + "스트라이크";
        }

        if (strike == 0 && ball == 0) {
            result = "낫싱";
        }

        return result;
    }

    public boolean isThreeStrike() {
        return strike == 3;
    }
}
