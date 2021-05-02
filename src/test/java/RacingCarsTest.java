import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RacingCarsTest {

    @Test
    void sameCarNamesTest() {
        List<Car> names = new ArrayList<>();
        names.add(new Car("jisu"));
        names.add(new Car("jisu"));
        assertThatThrownBy(() -> {
            new RacingCars(names);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("중복된 이름이 존재합니다.");
    }
}
