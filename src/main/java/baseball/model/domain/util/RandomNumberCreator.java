package baseball.model.domain.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberCreator {
    private static final int NUMBER_LENGTH = 3;
    private static final int MAX_RANGE = 9;
    private static final int MIN_RANGE = 1;

    private final List<Integer> randomNumber = new ArrayList<>();
    private final Random random = new Random();

    public List<Integer> createRandomNumber() {
        while (randomNumber.size() < NUMBER_LENGTH) {
            addNumer(makeRandomNumber(random));
        }
        return randomNumber;
    }

    private int makeRandomNumber(Random random) {
        return random.nextInt(MAX_RANGE) + MIN_RANGE;
    }

    private void addNumer(int num) {
        if (isDuplicateNumber(num)) {
            randomNumber.add(num);
        }
    }

    private boolean isDuplicateNumber(int num) {
        return !randomNumber.contains(num);
    }
}
