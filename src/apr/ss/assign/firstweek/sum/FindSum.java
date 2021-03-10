package apr.ss.assign.firstweek.sum;

import java.util.ArrayList;

public class FindSum {
    private Integer sum;

    public FindSum(ArrayList<Integer> list){
        sum = 0;
        for (Integer num : list) {
            sum += num;
        }
    }

    public Integer getSum(){
        return sum;
    }

}
