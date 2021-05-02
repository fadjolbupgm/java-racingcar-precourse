import java.util.Arrays;
import java.util.List;

public class StringUtils {
    public static List<String> splitComma(String userInput) {
        return Arrays.asList(userInput.split(","));
    }
}
