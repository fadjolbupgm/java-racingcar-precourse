import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CarTest {
    @ParameterizedTest
    @ValueSource(strings = {"momo","nana","bora"})
    @DisplayName("이름 규칙에 문제가 없어서 정상적으로 생성되는 경우")
    void inputNameValidateTest(String name) {
        assertThat(new Car(name));
    }

    @ParameterizedTest
    @ValueSource(strings = {"overLength", "helloWorld", "ImTheKing"})
    void validateOverLengthTest(String name) {
        assertThatThrownBy(() -> {
            new Car(name);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("길이 초과");
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "   ", "            "})
    void checkBlankTest(String name) {
        assertThatThrownBy(() -> {
            new Car(name);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("공백은 입력할 수 없습니다.");
    }

    @Test
    void checkNullTest() {
        assertThatThrownBy(() -> {
            new Car(null);
        }).isInstanceOf(NullPointerException.class)
                .hasMessageContaining("널값은 입력할 수 없습니다.");
    }
}
