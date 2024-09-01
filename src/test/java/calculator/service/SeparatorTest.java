package calculator.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SeparatorTest {

    @DisplayName("문자열을 공백으로 구분하여 분리한다.")
    @Test
    void separate() {
        //given
        String input = "2 + 3 * 4 / 2";
        Separator separator = new Separator();

        //when
        String[] separate = separator.separate(input);

        //then
        assertThat(separate).contains("2", "+", "3", "*", "4", "/", "2");
    }
}