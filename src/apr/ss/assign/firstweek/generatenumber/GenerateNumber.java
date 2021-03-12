package apr.ss.assign.firstweek.generatenumber;

import java.util.ArrayList;

public class GenerateNumber {

    public int randomNumber;
    private int max = 100;

    public GenerateNumber(){
        randomNumber = (int) (Math.random() * max);
    }

    public GenerateNumber(int max) {
        this.max = max;
        randomNumber = (int) (Math.random() * max);
    }

    public GenerateNumber(ArrayList<Integer> bannedNumbers){

        randomNumber = (int) (Math.random() * max);
        while(bannedNumbers.contains(randomNumber))
            randomNumber = (int) (Math.random() * max);

    }
}
