package apr.ss.assign.firstweek.dayfive.basiclambdas;

import java.util.List;

public class BasicLambdaSortEFirst {

    public static List<String> getSorted(List<String> unsorted) {
        LambdaInterface lambdaSortE = list -> {

            list.sort((o1, o2) -> o2.charAt(0) == o1.charAt(0) ? 0 : o1.charAt(0) == 'e' ? -1 : 1);

            return list;
        };

        return lambdaSortE.display(unsorted);
    }
}
