package apr.ss.assign.firstweek.dayfive.basiclambdas;

import java.util.Comparator;
import java.util.List;

public class BasicLambdaSortDesc {

    public static List<String> getSorted(List<String> unsorted) {
        LambdaInterface lambdaSortDesc = list -> {
            list.sort(Comparator.comparingInt(String::length).reversed());
            return list;
        };

        return lambdaSortDesc.display(unsorted);
    }

}
