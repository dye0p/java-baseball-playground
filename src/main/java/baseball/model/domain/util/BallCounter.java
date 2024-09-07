package baseball.model.domain.util;

import java.util.List;
import java.util.stream.IntStream;

public class BallCounter implements StrikeAndBallCounter {
    private static final int MIM_RANGE = 0;
    private static final int MAX_RANGE = 3;

    @Override
    public int countStrikeAndBall(List<Integer> computerSecretNumber, List<Integer> playerSecretNumber) {
        return (int) IntStream.range(MIM_RANGE, MAX_RANGE)
                .filter(i -> !computerSecretNumber.get(i).equals(playerSecretNumber.get(i)))
                .flatMap(i -> IntStream.range(MIM_RANGE, MAX_RANGE)
                        .filter(j -> computerSecretNumber.get(i).equals(playerSecretNumber.get(j))))
                .count();
    }
}
