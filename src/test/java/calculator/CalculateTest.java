package calculator;

import calculator.service.CalculateService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateTest {

    @DisplayName("사용자가 입력한 문자열을 계산한다.")
    @ParameterizedTest
    @CsvSource(value = {
            "2 + 3 * 4 / 2, 10",
            "3 + 5 * 2 / 2, 8"
    })
    void 문자열_계산기(String input, int expected) {
        //given
        CalculateService calculateService = new CalculateService();

        //when
        int result = calculateService.cal(input);

        //then
        assertThat(result).isEqualTo(expected);
    }
}

