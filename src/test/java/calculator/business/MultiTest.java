package calculator.business;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MultiTest {

    @DisplayName("곱셈을 할 수 있다.")
    @Test
    void multi() {
        //given
        int sum = 0;
        String num = "1";

        //when
        int result = new Multi(sum, num).multi();

        //then
        assertThat(result).isEqualTo(0);
    }

}