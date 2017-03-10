import java.io.BufferedReader;
import java.io.IOException;

public class Driver {

    private final Game game;
    private final BufferedReader input;

    public Driver(Game game, BufferedReader input) {
        this.game = game;
        this.input = input;
    }

    public void start() throws IOException {
        Result result;
        do {
            System.out.println("guess pls: ");
            String guess = input.readLine();
            result = game.checkGuess(Integer.parseInt(guess));
            System.out.println(result);
        } while (result != Result.MATCH);
    }
}
