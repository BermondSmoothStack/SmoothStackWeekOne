package apr.ss.assign.firstweek.dayfive.basiclambdas;

import java.util.Comparator;
import java.util.List;

public class BasicLambdaSortAscending {

    public static List<String> getSorted(List<String> unsorted) {
        LambdaInterface lambdaSortAsc = list -> {
            list.sort(Comparator.comparingInt(String::length));
            return list;
        };

        return lambdaSortAsc.display(unsorted);
    }
}
