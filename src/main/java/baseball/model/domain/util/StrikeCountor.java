package baseball.model.domain.util;

import java.util.List;
import java.util.stream.IntStream;

public class StrikeCountor {
    private static final int MIM_RANGE = 0;
    private static final int MAX_RANGE = 3;

    public int countStrike(List<Integer> computerSecretNumber, List<Integer> playerNumber) {
        return (int) IntStream.range(MIM_RANGE, MAX_RANGE)
                .filter(i -> computerSecretNumber.get(i).equals(playerNumber.get(i))).count();
    }
}
