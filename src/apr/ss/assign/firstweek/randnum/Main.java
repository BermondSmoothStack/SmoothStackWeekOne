package apr.ss.assign.firstweek.randnum;

public class Main {

    public static void main(String[] args) {

        GenerateNumber number = new GenerateNumber();
        GuessNumber game = new GuessNumber(number.randomNumber);
//        GuessNumber game = new GuessNumber(10);
        game.printGameMessage();

    }
}
