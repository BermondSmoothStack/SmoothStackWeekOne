package apr.ss.assign.firstweek.maxindex;
import apr.ss.assign.firstweek.generatenumber.GenerateNumber;

import java.util.ArrayList;

public class Generate2DArray {

    private Integer randArray[][];

    public Generate2DArray(Integer length){
        this.randArray = new Integer[length][2];
        ArrayList<Integer> currentNumbers = new ArrayList<>();

        for (int i = 0; i < length;i++) {
            GenerateNumber first = new GenerateNumber(currentNumbers);
            this.randArray[i][0] = first.randomNumber;
            currentNumbers.add(this.randArray[i][0]);

            GenerateNumber second = new GenerateNumber(currentNumbers);
            this.randArray[i][1] = second.randomNumber;
            currentNumbers.add(this.randArray[i][1]);

        }
    }

    public Integer[][] getArray(){
        return randArray;
    }

}
