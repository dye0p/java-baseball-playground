package calculator.business;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlusTest {

    @DisplayName("덧셈을 할 수 있다.")
    @Test
    void plus() {
        //given
        int sum = 0;
        String num = "1";

        //when
        int result = new Plus(sum, num).plus();

        //then
        assertThat(result).isEqualTo(1);
    }
}