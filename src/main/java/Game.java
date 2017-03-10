/**
 * Created by alexandraquintano on 3/7/17.
 */
public class Game {

    private int target;

    public Game(int target) {
        this.target = target;
    }

    public Result checkGuess(int guess) {
        if (guess == target)
            return Result.MATCH;
        else if (guess > target)
            return Result.TOO_HIGH;
        else
            return Result.TOO_LOW;
    }
}
