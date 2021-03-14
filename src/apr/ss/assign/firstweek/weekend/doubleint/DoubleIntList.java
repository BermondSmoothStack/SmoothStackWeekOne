package apr.ss.assign.firstweek.weekend.doubleint;

import java.util.List;
import java.util.stream.Collectors;

public class DoubleIntList {

    public static List<Integer> doubleList(List<Integer> l){

        return l.stream().map(o -> (o*2)).collect(Collectors.toList());

    }
}
