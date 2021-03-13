package apr.ss.assign.firstweek.dayfive.basiclambdas;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BasicLambdaSortEFirst implements BasicLambdaSort {

    List<String> sorted;

    public BasicLambdaSortEFirst(List<String> unsorted) {

        LambdaInterface lambdaSortE = list -> {

            list.sort((o1, o2) -> o2.charAt(0) == o1.charAt(0) ? 0 : o1.charAt(0) == 'e' ? -1 : 1);

            return list;
        };

        this.sorted = lambdaSortE.display(unsorted);
    }

    public List<String> getSorted() {
        return sorted;
    }
}
