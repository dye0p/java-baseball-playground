package baseball.model.domain.util;

import baseball.model.domain.util.gameresult.BothBallAndStrikeStrategy;
import baseball.model.domain.util.gameresult.GameResultStrategy;
import baseball.model.domain.util.gameresult.NothingStrategy;
import baseball.model.domain.util.gameresult.OnlyBallStrategy;
import baseball.model.domain.util.gameresult.OnlyStrikeStrategy;
import baseball.model.domain.util.gameresult.ThreeStrikeStrategy;
import java.util.List;

public class GameResultManager {
    private static final String EXCEPTION_TEXT = "결과가 없습니다.";

    private final List<GameResultStrategy> strategies;

    public GameResultManager() {
        strategies = List.of(
                new ThreeStrikeStrategy(),
                new BothBallAndStrikeStrategy(),
                new OnlyStrikeStrategy(),
                new OnlyBallStrategy(),
                new NothingStrategy()
        );
    }

    public String gameResult(int strike, int ball) {
        return strategies.stream()
                .filter(strategy -> strategy.isApplicable(strike, ball))
                .findFirst()
                .map(strategy -> strategy.resultMessage(strike, ball))
                .orElseThrow(() -> new IllegalStateException(EXCEPTION_TEXT));
    }
}