package baseball.model.domain;

import baseball.model.domain.util.StringToIntegerListConvertor;
import java.util.List;

public class Judge {

    private int strike;
    private int ball;
    private String result;

    private final StringToIntegerListConvertor convertor = new StringToIntegerListConvertor();

    public String calculateStrikeAndBall(String playerInputNumber, List<Integer> computerSecretNumber) {

        List<Integer> playerNumber = convertor.converte(playerInputNumber);

        strike = 0;
        ball = 0;

        for (int i = 0; i < 3; i++) {
            Integer computer = computerSecretNumber.get(i);
            Integer player = playerNumber.get(i);

            if (computer.equals(player)) {
                strike++;
            }

            if (!computer.equals(player)) {
                for (int j = 0; j < 3; j++) {
                    Integer player2 = playerNumber.get(j);

                    if (i != j && computer.equals(player2)) {
                        ball++;
                    }
                }
            }
        }

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
