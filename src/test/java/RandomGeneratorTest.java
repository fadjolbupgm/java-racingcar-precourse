import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class RandomGeneratorTest {
    public static final int ENOUGH_BIG_NUMBER = 10000;

    @Test
    void create() {
        for(int i = 0; i< ENOUGH_BIG_NUMBER; i++) {
            assertThat(RandomGenerator.create()).isBetween(0,9);
        }
    }
}
