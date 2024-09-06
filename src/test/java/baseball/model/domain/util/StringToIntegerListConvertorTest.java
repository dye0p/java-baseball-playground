package baseball.model.domain.util;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringToIntegerListConvertorTest {

    private StringToIntegerListConvertor stringToIntegerListConvertor;

    @BeforeEach
    void setUp() {
        stringToIntegerListConvertor = new StringToIntegerListConvertor();
    }

    @DisplayName("문자열을 Integer 타입의 List로 변환한다.")
    @Test
    void convertor() {
        //given
        String input = "123";

        //when
        List<Integer> reuslt = stringToIntegerListConvertor.converte(input);

        //then
        assertThat(reuslt).contains(1, 2, 3);
    }
}