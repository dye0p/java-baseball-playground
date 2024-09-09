package baseball.controller;

import baseball.exception.ErrorCode;
import java.util.HashSet;
import java.util.function.IntFunction;

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
            throw new IllegalArgumentException(ErrorCode.INVALID_LENGTH_MESSAGE.getValue());
        }
    }

    private boolean isLength(String input) {
        return input.length() != LENGTH;
    }

    private void inputRangeValidate(String input) {
        input.chars()
                .mapToObj(convertToChar())
                .filter(this::isOutOfRange)
                .findFirst()
                .ifPresent(charNumber -> throwOutOfRangeException());
    }

    private boolean isOutOfRange(char charNumber) {
        if (charNumber < MIN_RANGE) {
            return true;
        }
        return charNumber > MAX_RANGE;
    }

    private void throwOutOfRangeException() {
        throw new IllegalArgumentException(ErrorCode.NUMBER_OUT_OF_RANGE_MESSAGE.getValue());
    }

    private void inputDuplicateValidate(String input) {
        HashSet<Character> hashSet = new HashSet<>();

        input.chars()
                .mapToObj(convertToChar())
                .filter(charNumber -> !hashSet.add(charNumber))
                .findFirst()
                .ifPresent(charNumber -> throwDuplicateNumberException());
    }

    private IntFunction<Character> convertToChar() {
        return charNumber -> (char) charNumber;
    }

    private void throwDuplicateNumberException() {
        throw new IllegalArgumentException(ErrorCode.DUPLICATE_NUMBER_MESSAGE.getValue());
    }
}
