package baseball.enums;

public enum GameOption {
    RESTART("1"),
    END("2");

    private final String value;

    GameOption(String value) {
        this.value = value;
    }

    public int getvalue() {
        return stringToInt(value);
    }

    private int stringToInt(String value) {
        return Integer.parseInt(value);
    }
}
