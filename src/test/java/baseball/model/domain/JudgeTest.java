package baseball.model.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class JudgeTest {

    private Judge judge;

    @BeforeEach
    void setUp() {
        judge = new Judge();
    }

    @DisplayName("게임의 결과를 계산한다.")
    @ParameterizedTest()
    @CsvSource({
            "123, 7,1,3, 1볼 1스트라이크",
            "145, 7,1,3, 1볼",
            "671, 7,1,3, 2볼",
            "713, 7,1,3, 3스트라이크",
            "216, 7,1,3, 1스트라이크",
            "123, 4,2,5, 1스트라이크",
            "456, 4,2,5, 1볼 1스트라이크",
            "789, 4,2,5, 낫싱"
    })
    void calculateStrikeAndBall(String player, String nunmberIndex1, String nunmberIndex2, String nunmberIndex3,
                                String expectedResult) {
        //given
        List<Integer> computerSecretNumber = List.of(Integer.parseInt(nunmberIndex1), Integer.parseInt(nunmberIndex2),
                Integer.parseInt(nunmberIndex3));

        //when
        String result = judge.calculateStrikeAndBall(player, computerSecretNumber);

        //then
        assertThat(result).isEqualTo(expectedResult);
    }
}