package apr.ss.assign.firstweek.randnum;

import apr.ss.assign.firstweek.GenerateNumber;

public class InitializeGuessNumber {

    public InitializeGuessNumber(){
        GenerateNumber number = new GenerateNumber();
        GuessNumber game = new GuessNumber(number.randomNumber);
        game.printGameMessage();
    }

}
