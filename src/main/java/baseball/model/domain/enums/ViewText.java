package baseball.model.domain.enums;

public enum ViewText {
    INPUT_NUMBER_FORMAT("숫자를 입력해 주세요 : "),
    CHOIC_GAME_STATUS_FORMAT("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    GAME_WIN_MESSAGE_FORMAT("3개의 숫자를 모두 맞히셨습니다! 게임 종료");

    private final String value;

    ViewText(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
