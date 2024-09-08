package baseball.model.domain;

import static org.assertj.core.api.Assertions.assertThat;

import baseball.model.domain.enums.GameStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GameTest {

    @DisplayName("게임을 시작했을때 게임의 상태는 IN_PROGRESS 이다.")
    @Test
    void startGame() {
        //given //when
        Game game = Game.startGame();

        //then
        assertThat(game.getGameStatus()).isEqualTo(GameStatus.IN_PROGRESS);
    }

    @DisplayName("게임을 종료했을때 게임의 상태는 END 이다.")
    @Test
    void end() {
        //given //when
        Game game = new Game(GameStatus.END);

        //then
        assertThat(game.getGameStatus()).isEqualTo(GameStatus.END);
    }

    @DisplayName("게임의 종료상태라면 True를 반환한다.")
    @Test
    void gameEndIsTrue() {
        //given
        Game game = new Game(GameStatus.END);

        // when
        boolean result = game.gameEnd();

        //then
        assertThat(result).isTrue();
    }

    @DisplayName("게임의 종료상태가 아니라면 fasle를 반환한다.")
    @Test
    void notGameEndIsFalse() {
        //given
        Game game = Game.startGame();

        // when
        boolean result = game.gameEnd();

        //then
        assertThat(result).isFalse();
    }
}