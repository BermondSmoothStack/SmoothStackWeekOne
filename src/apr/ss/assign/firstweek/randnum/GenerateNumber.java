package apr.ss.assign.firstweek.randnum;

import java.util.ArrayList;

public class GenerateNumber {

    public int randomNumber;

    public GenerateNumber(){
        randomNumber = (int) (Math.random() * 99);
    }

    public GenerateNumber(ArrayList<Integer> bannedNumbers){

        randomNumber = (int) (Math.random() * 99);
        while(bannedNumbers.contains(randomNumber))
            randomNumber = (int) (Math.random() * 99);

    }


}
