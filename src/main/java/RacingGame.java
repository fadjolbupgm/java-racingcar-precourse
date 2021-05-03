import java.util.List;

public class RacingGame{
        private RacingCars racingCars;
        private Round round;

        public void run() {
            initializeRace();
            playGame();
        }

        private void initializeRace() {
            try{
                List<String> carNames = StringUtils.splitComma(InputView.getInput());
                racingCars = CarFactory.create(carNames);
                round = new Round(InputView.getTimes());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                initializeRace();
            }
        }

        private void playGame() {
            while(!round.isEnd()){
                racingCars.move();
                OutputView.printRoundResult(racingCars.getCars());
                round.reduce();
            }
            OutputView.printWinner(racingCars.getWinner());
        }

        public static void main(String[] args) {
            new RacingGame().run();
        }
}
