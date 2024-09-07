package baseball.model.domain.util;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CountBallTest {
    private CountBall countBall;

    @BeforeEach
    void setUp() {
        countBall = new CountBall();
    }

    @DisplayName("볼 개수를 계산한다.")
    @Test
    void countBall() {
        //given
        List<Integer> computerSecretNumber = List.of(7, 1, 3);
        List<Integer> playerSecretNumber = List.of(1, 7, 8);

        //when
        int result = countBall.countBall(computerSecretNumber, playerSecretNumber);

        //then
        assertThat(result).isEqualTo(2);
    }
}