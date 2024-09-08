package baseball.model.domain.util;


import static org.assertj.core.api.Assertions.assertThat;

import baseball.model.domain.util.calculator.StrikeCounter;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StrikeCountorTest {

    private StrikeCounter strikeCountor;

    @BeforeEach
    void setUp() {
        strikeCountor = new StrikeCounter();
    }

    @DisplayName("스트라이크 개수를 계산한다.")
    @Test
    void countStrike() {
        //given
        List<Integer> computerSecretNumber = List.of(7, 1, 3);
        List<Integer> playerSecretNumber = List.of(7, 4, 3);

        //when
        int result = strikeCountor.countStrikeAndBall(computerSecretNumber, playerSecretNumber);

        //then
        assertThat(result).isEqualTo(2);
    }
}