package baseball.controller;


import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class InputValidatorTest {

    private InputValidator inputValidator;

    @BeforeEach
    void setUp() {
        inputValidator = new InputValidator();
    }

    @DisplayName("잘못된 입력이 주어지면 예외를 발생시킨다.")
    @ParameterizedTest()
    @CsvSource({
            "1234, 3자리 숫자를 입력해야 합니다.",
            "032, 1 부터 9 사이의 숫자를 입력해야 합니다.",
            "112, 중복된 숫자없이 입력해야 합니다."
    })
    void inputValidator(String input, String expected) {
        //given //when //then
        assertThatThrownBy(() -> inputValidator.validateInputNumber(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(expected);
    }
}