package baseball.controller;

import baseball.exception.ErrorCode;
import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class InputValidator {
    private static final int LENGTH = 3;
    private static final char MAX_RANGE = '9';
    private static final char MIN_RANGE = '1';

    public void validateInputNumber(String input) {
        inputLengthValidate(input);
        inputRangeValidate(input);
        inputDuplicateValidate(input);
    }

    private void inputLengthValidate(String input) {
        if (isLength(input)) {
            invalidLengthMessageException();
        }
    }

    private boolean isLength(String input) {
        return input.length() != LENGTH;
    }

    private void invalidLengthMessageException() {
        throw new IllegalArgumentException(ErrorCode.INVALID_LENGTH_MESSAGE.getValue());
    }

    private void inputRangeValidate(String input) {
        input.chars()
                .mapToObj(convertToChar())
                .filter(this::isOutOfRange)
                .findFirst()
                .ifPresent(outOfRangeException());
    }

    private boolean isOutOfRange(char charNumber) {
        if (charNumber < MIN_RANGE) {
            return true;
        }
        return charNumber > MAX_RANGE;
    }

    private Consumer<Character> outOfRangeException() {
        return charNumber -> throwOutOfRangeException();
    }

    private void throwOutOfRangeException() {
        throw new IllegalArgumentException(ErrorCode.NUMBER_OUT_OF_RANGE_MESSAGE.getValue());
    }

    private void inputDuplicateValidate(String input) {
        HashSet<Character> hashSet = new HashSet<>();

        input.chars()
                .mapToObj(convertToChar())
                .filter(isDuplicateCharacter(hashSet))
                .findFirst()
                .ifPresent(duplicateNumberException());
    }

    private IntFunction<Character> convertToChar() {
        return charNumber -> (char) charNumber;
    }

    private Predicate<Character> isDuplicateCharacter(HashSet<Character> hashSet) {
        return charNumber -> !hashSet.add(charNumber);
    }

    private Consumer<Character> duplicateNumberException() {
        return charNumber -> throwDuplicateNumberException();
    }

    private void throwDuplicateNumberException() {
        throw new IllegalArgumentException(ErrorCode.DUPLICATE_NUMBER_MESSAGE.getValue());
    }
}
