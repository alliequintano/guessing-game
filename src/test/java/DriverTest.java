
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import java.io.BufferedReader;
import java.io.IOException;

public class DriverTest {

    private Game game;
    private Driver driver;
    private BufferedReader input;

    @Before
    public void setup() {
        game = mock(Game.class);
        input = mock(BufferedReader.class);
        driver = new Driver(game, input);
    }

    @Test
    public void shouldUseInputFromUserToCheckGuess() throws IOException {
        when(game.checkGuess(6)).thenReturn(Result.MATCH);
        when(input.readLine()).thenReturn("6");

        driver.start();

        verify(game).checkGuess(6);
    }

   @Test
    public void shouldTakeInputFromUserAgainAfterNoMatch() throws IOException {
        when(game.checkGuess(Mockito.anyInt()))
                .thenReturn(Result.TOO_LOW)
                .thenReturn(Result.MATCH);
        when(input.readLine()).thenReturn("6").thenReturn("9");

        driver.start();

        verify(input, times(2)).readLine();
   }

}