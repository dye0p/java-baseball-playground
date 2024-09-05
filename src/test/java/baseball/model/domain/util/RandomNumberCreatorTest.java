package baseball.model.domain.util;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.HashSet;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RandomNumberCreatorTest {

    private RandomNumberCreator randomNumberCreator;

    @BeforeEach
    void setUp() {
        randomNumberCreator = new RandomNumberCreator();
    }

    @DisplayName("난수를 생성한다.")
    @Test
    void createRandomNumber() {
        //given //when
        List<Integer> randomNumber = randomNumberCreator.createRandomNumber();

        //then
        assertThat(randomNumber).isNotNull();
    }

    @DisplayName("생성한 난수의 길이는 3이다.")
    @Test
    void createRandomNumberSizeIs_3() {
        //given //when
        List<Integer> randomNumber = randomNumberCreator.createRandomNumber();

        //then
        assertThat(randomNumber).isNotNull();
        assertThat(randomNumber.size()).isEqualTo(3);
    }

    @DisplayName("생성한 난수는 1부터 9까지의 숫자를 가진다.")
    @Test
    void createRandomNumberInRange() {
        //given //when
        List<Integer> randomNumber = randomNumberCreator.createRandomNumber();

        //then
        for (Integer num : randomNumber) {
            assertThat(num).isBetween(1, 9);
        }
    }

    @DisplayName("생성한 난수는 중복된 값을 가지지 않는다.")
    @Test
    void createRandomNumberIsNotDuplicate() {
        //given //when
        List<Integer> randomNumber = randomNumberCreator.createRandomNumber();

        //then
        HashSet<Integer> result = new HashSet<>(randomNumber);
        assertThat(result.size()).isEqualTo(3);
    }
}