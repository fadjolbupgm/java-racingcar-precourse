public class Car {
    public static final int MAX_LENGTH = 5;
    private static final int MOVE_STANDARD = 4;
    private int position = 0;

    private final String name;

    public Car(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        checkLength(name);
        checkNull(name);
        checkBlank(name);
    }

    private void checkLength(String name) {
        if (name.length() > MAX_LENGTH)
            throw new IllegalArgumentException("길이가 초과되었습니다.");
    }

    private void checkNull(String name) {
        if(name == null)
            throw new NullPointerException("널값은 입력할 수 없습니다.");
    }

    private void checkBlank(String name) {
        if(name.trim().isEmpty())
            throw new IllegalArgumentException("공백은 입력할 수 없습니다.");
    }

    public void move(int randomValue) {
        if(randomValue >= MOVE_STANDARD){
            this.position++;
        }
    }
    public int getPosition() {
        return position;
    }
}
