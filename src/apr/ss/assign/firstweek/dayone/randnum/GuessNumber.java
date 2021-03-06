package apr.ss.assign.firstweek.dayone.randnum;

public class GuessNumber {

    private final Integer randomNumber;
    private String gameMessage;

    public GuessNumber(int number){
        randomNumber = number;
        System.out.println("Number has been rolled.");

        startGame();

    }

    private void startGame(){
        int iter = 0;
        boolean win;
        String winMessage = "Congratulations! You won. The number is: " + randomNumber;
        String lostMessage = "I'm sorry! You lost... The number was: " + randomNumber;

        do{
            win = gameInstance();
            iter++;
        } while ((iter < 5) && !win);

        gameMessage =  win? winMessage : lostMessage;

    }

    private boolean gameInstance(){
        int guess;
        int maxCorrect = randomNumber + 10;
        int minCorrect = randomNumber - 10;

        System.out.println("Please guess the number.");

        GuessNumberIntInputHandler input = new GuessNumberIntInputHandler();
        guess = input.getVerifiedInput();

        return ((guess >= minCorrect) && (guess <= maxCorrect));

    }

    public void printGameMessage(){
        System.out.println(gameMessage);
    }

}
