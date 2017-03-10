
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by alexandraquintano on 3/7/17.
 */
public class GameTest {

    @Test
    public void shouldWinGameIfNumberIsGuessedCorrect() {
        Game game = new Game(420);
        Result result = game.checkGuess(420);
        assertThat(result, is(Result.MATCH));
    }

    @Test
    public void shouldTellUserIfGuessIsHigherThanTarget() {
        Game game = new Game(6);
        Result result = game.checkGuess(999);

        assertThat(result, is(Result.TOO_HIGH));
    }

    @Test
    public void shouldTellUserIfGuessIsLowerThanTarget() {
        Game game = new Game(9);
        Result result = game.checkGuess(1);

        assertThat(result, is(Result.TOO_LOW));
    }

}