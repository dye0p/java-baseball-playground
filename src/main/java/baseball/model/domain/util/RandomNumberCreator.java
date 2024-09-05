package baseball.model.domain.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberCreator {
    private static final int NUMBER_LENGTH = 3;
    private static final int MAX_RANGE = 9;
    private static final int MIN_RANGE = 1;

    private List<Integer> randomNumber;

    public List<Integer> createRandomNumber() {
        Random random = new Random();
        randomNumber = new ArrayList<>();

        while (randomNumber.size() < NUMBER_LENGTH) {
            int num = random.nextInt(MAX_RANGE) + MIN_RANGE;
            addNumer(num);
        }
        return randomNumber;
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
