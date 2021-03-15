package apr.ss.assign.firstweek.weekend.ones;

import java.util.List;
import java.util.stream.Collectors;

public class OnesDigit {

    public static List<Integer> getOnesDigit(List<Integer> l){
        return l.stream().map(i -> i % 10).collect(Collectors.toList());
    }

}
