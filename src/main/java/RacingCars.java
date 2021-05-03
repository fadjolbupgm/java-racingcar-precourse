import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RacingCars {
    private final List<Car> cars;

    public RacingCars(List<Car> cars) {
        validate(cars);
        this.cars = cars;
    }

    private void validate(List<Car> names) {
        checkDuplication(names);
    }

    private void checkDuplication(List<Car> names) {
        Set<Car> set = names.stream().collect(Collectors.toSet());
        if (set.size() != names.size())
            throw new IllegalArgumentException("중복된 이름이 존재합니다.");
    }

    public void move() {
        for (Car car : cars) {
            car.move(RandomGenerator.create());
        }
    }

    public List<Car> getWinner() {
        List<Car> winner = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).isWinner(getMaxPosition()))
                winner.add(cars.get(i));
        }
        return winner;
    }

    private int getMaxPosition() {
        Car max = Collections.max(cars);
        return max.getPosition();
    }

    public List<Car> getCars() {
        return cars;
    }
}