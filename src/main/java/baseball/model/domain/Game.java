package baseball.model.domain;

import baseball.model.domain.enums.GameStatus;

public class Game {

    private GameStatus gameStatus;

    public Game(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public static Game startGame() {
        return new Game(GameStatus.IN_PROGRESS);
    }

    public void end() {
        this.gameStatus = GameStatus.END;
    }

    public boolean gameEnd() {
        return this.gameStatus == GameStatus.END;
    }

    public GameStatus getGameStatus() {
        return this.gameStatus;
    }
}
