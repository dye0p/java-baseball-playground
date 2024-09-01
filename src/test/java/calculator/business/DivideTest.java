package calculator.business;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DivideTest {

    @DisplayName("나누기를 할 수 있다.")
    @Test
    void divide() {
        //given
        int sum = 0;
        String num = "1";

        //when
        int result = new Divide(sum, num).divide();

        //then
        assertThat(result).isEqualTo(0);
    }

}