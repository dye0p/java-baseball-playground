package baseball.model.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComputerTest {

    @DisplayName("랜덤한 3자리의 난수를 생성한다.")
    @Test
    void createRandomNumber() {
        //given
        Computer computer = new Computer();

        //when
        List<Integer> randomNumber = computer.createRandomNumber();

        //then
        assertThat(randomNumber).hasSize(3);
    }

}