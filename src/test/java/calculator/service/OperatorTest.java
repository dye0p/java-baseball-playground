package calculator.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OperatorTest {


    @DisplayName("문자열이 주어지면 사칙연산을 하여 결과를 리턴한다.")
    @Test
    void operate() {
        //given
        Operator operator = new Operator();
        String[] str = {"2", "+", "3", "*", "4", "/", "2"};

        //when
        int result = operator.operate(str);

        //then
        assertThat(result).isEqualTo(10);
    }
}