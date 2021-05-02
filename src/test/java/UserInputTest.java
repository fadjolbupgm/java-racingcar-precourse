import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class UserInputTest {

    @Test
    @DisplayName("올바르게 ,를 구분으로 입력하는 경우")
    void splitTest() {
        List<String> names = StringUtils.splitComma("momo,nana,bora");
        assertThat(names).containsExactly("momo","nana","bora");
        assertThat(names).hasSize(3);
    }
}
