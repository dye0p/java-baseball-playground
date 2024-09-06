package baseball.model.domain;

import baseball.model.domain.util.RandomNumberCreator;
import java.util.List;

public class Computer {

    private final RandomNumberCreator randomNumberCreator = new RandomNumberCreator();

    public List<Integer> createRandomNumber() {
        return randomNumberCreator.createRandomNumber();
    }
}

