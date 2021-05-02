import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RacingCars {
    private final List<Car> names;

    public RacingCars(List<Car> names) {
        validate(names);
        this.names = names;
    }

    private void validate(List<Car> names) {
        checkDuplication(names);
    }

    private void checkDuplication(List<Car> names) {
        Set<Car> set = names.stream().collect(Collectors.toSet());
        if(set.size() != names.size())
            throw new IllegalArgumentException("중복된 이름이 존재합니다.");
    }
}