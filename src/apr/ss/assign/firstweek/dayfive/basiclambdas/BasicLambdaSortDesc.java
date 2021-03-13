package apr.ss.assign.firstweek.dayfive.basiclambdas;

import java.util.Comparator;
import java.util.List;

public class BasicLambdaSortDesc implements BasicLambdaSort{

    List<String> sorted;

    public BasicLambdaSortDesc(List<String> unsorted) {
        LambdaInterface lambdaSortDesc = list -> {
            list.sort(Comparator.comparingInt(String::length).reversed());
            return list;
        };

        this.sorted = lambdaSortDesc.display(unsorted);
    }

    public List<String> getSorted() {
        return sorted;
    }

}
