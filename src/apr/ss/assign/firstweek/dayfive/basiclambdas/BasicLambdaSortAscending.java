package apr.ss.assign.firstweek.dayfive.basiclambdas;

import java.util.Comparator;
import java.util.List;

public class BasicLambdaSortAscending implements BasicLambdaSort{

    List<String> sorted;

    public BasicLambdaSortAscending(List<String> unsorted) {
        LambdaInterface lambdaSortAsc = list -> {
            list.sort(Comparator.comparingInt(String::length));
            return list;
        };

        this.sorted = lambdaSortAsc.display(unsorted);
    }

    public List<String> getSorted() {
        return sorted;
    }
}
