package apr.ss.assign.firstweek.randnum;

public class Main {

    public static void main(String[] args) {

        GenerateNumber number = new GenerateNumber();
        GuessNumber game = new GuessNumber(number.randomNumber);
        game.printGameMessage();

    }
}
