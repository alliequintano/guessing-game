import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by alexandraquintano on 3/7/17.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Game game = new Game(9);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Driver driver = new Driver(game, input);
        driver.start();
    }
}

