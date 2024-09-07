package baseball.model.domain.util;

import java.util.List;

public interface StrikeAndBallCounter {

    int countStrikeAndBall(List<Integer> computerSecretNumber, List<Integer> playerSecretNumber);
}