package baseball.enums;

public enum GameResultText {
    STRIKE("스트라이크"),
    BALL("볼"),
    NOTHING("낫싱");

    private final String value;

    GameResultText(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
