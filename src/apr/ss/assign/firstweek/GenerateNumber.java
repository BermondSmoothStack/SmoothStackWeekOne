package apr.ss.assign.firstweek;

import java.util.ArrayList;

public class GenerateNumber {

    public int randomNumber;
    private final int max = 100;

    public GenerateNumber(){
        randomNumber = (int) (Math.random() * max);
    }

    public GenerateNumber(ArrayList<Integer> bannedNumbers){

        randomNumber = (int) (Math.random() * max);
        while(bannedNumbers.contains(randomNumber))
            randomNumber = (int) (Math.random() * max);

    }


}
