package apr.ss.assign.firstweek.maxindex;

import java.lang.reflect.Array;

public class ArraySumFinder {

    private final Integer[][] array;
    private final Integer arraySum;

    public ArraySumFinder(Integer[][] array){
        this.array = array;
        arraySum = findArraySum();
    }

    private Integer findArraySum(){
        Integer sum = 0;
        for (Integer[] x : array) {
            Integer xsum = 0;

            for (Integer y :x) {
                xsum+=y;
            }
            sum+=xsum;
        }
        return sum;
    }

    public Integer getArraySum() {
        return arraySum;
    }
}
