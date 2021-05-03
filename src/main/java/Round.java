public class Round {
    private int round;
    private static final int MIN_ROUND = 1;
    private static final int MAX_ROUND = 30;

    public Round(String round) {
        validate(round);
        this.round = Integer.parseInt(round);
    }

    private void validate(String round) {
        checkNumberFormat(round);
        checkRange(round);
    }

    private void checkNumberFormat(String round) {
        try {
            Integer.parseInt(round);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("문자열은 입력 할 수 없습니다.");
        }
    }

    private void checkRange(String round) {
        int rounds = Integer.parseInt(round);
        if (rounds < MIN_ROUND || rounds > MAX_ROUND) {
            throw new IllegalArgumentException("플레이 할 라운드는 1~30회만 가능합니다.");
        }
    }

    public boolean isEnd() {
        return this.round == 0;
    }

    public void reduce() {
        if (this.round == 0) {
            throw new RuntimeException("모든 라운드가 종료되었습니다.");
        }
        this.round--;
    }
}
