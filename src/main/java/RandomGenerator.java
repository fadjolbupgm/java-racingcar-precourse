import java.util.Random;

public class RandomGenerator {
    private static final int BOUND = 10;

    public static int create() {
        return new Random().nextInt(BOUND);
    }
}
