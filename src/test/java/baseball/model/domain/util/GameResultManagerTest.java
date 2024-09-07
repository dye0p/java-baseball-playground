package baseball.model.domain.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class GameResultManagerTest {

    private GameResultManager gameResultManager;

    @BeforeEach
    void setUp() {
        gameResultManager = new GameResultManager();
    }

    @DisplayName("스트라이크와 볼 개수가 주어졌을 때 게임 결과를 반환할 수 있다.")
    @ParameterizedTest
    @CsvSource({
            "3, 0, 3스트라이크",
            "1, 1, 1볼 1스트라이크",
            "0, 1, 1볼",
            "1, 0, 1스트라이크"
    })
    void gameResultWithStrikeCount_3(int strike, int ball, String expected) {
        //given //when
        String result = gameResultManager.gameResult(strike, ball);

        //then
        assertThat(result).isEqualTo(expected);
    }

}