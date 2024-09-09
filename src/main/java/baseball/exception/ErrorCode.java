package baseball.exception;

public enum ErrorCode {

    INVALID_LENGTH_MESSAGE("3자리 숫자를 입력해야 합니다."),
    NUMBER_OUT_OF_RANGE_MESSAGE("1 부터 9 사이의 숫자를 입력해야 합니다."),
    DUPLICATE_NUMBER_MESSAGE("중복된 숫자없이 입력해야 합니다.");

    private final String value;

    ErrorCode(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
