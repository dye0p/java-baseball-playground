package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void 요구사항_1() {
        //given
        String str = "1,2";
        String str1 = "1";

        //when
        String[] result = str.split(",");
        String[] result1 = str1.split(",");

        //then
        assertThat(result).contains("1", "2");
        assertThat(result1).containsExactly("1");

    }

    @Test
    void 요구사항_2() {
        //given
        String str = "(1,2)";

        //when
        String substring = str.substring(1, 4);

        //then
        assertThat(substring).isEqualTo("1,2");

    }

    @DisplayName("문자열이 주어졌을 때 특정 위치의 문자를 가져올 수 있다.")
    @Test
    void 요구사항_3() {
        //given
        String str = "abc";

        //when
        char c = str.charAt(1);

        //then
        assertThat(c).isEqualTo('b');
    }

    @DisplayName("특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException 예외가 발생한다.")
    @Test
    void 요구사항_3_예외발생() {
        //given
        String str = "abc";

        //when //then
        assertThatThrownBy(() -> str.charAt(3))
                .isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessage("String index out of range: 3");
    }
}
