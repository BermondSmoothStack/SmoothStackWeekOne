package apr.ss.assign.firstweek.dayfive.basiclambdas;

import java.util.Comparator;
import java.util.List;

public class BasicLambdaSortFirstChar {

    public static List<String> getSorted(List<String> unsorted) {
        LambdaInterface lambdaSortFirstChar = list -> {
            list.sort((Comparator.comparingInt(o -> o.charAt(0))));
            return list;
        };
        return lambdaSortFirstChar.display(unsorted);
    }

}
