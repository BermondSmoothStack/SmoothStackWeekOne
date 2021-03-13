package apr.ss.assign.firstweek.dayfive.basiclambdas;

import java.util.Comparator;
import java.util.List;

public class BasicLambdaSortFirstChar implements  BasicLambdaSort{

    List<String> sorted;

    public BasicLambdaSortFirstChar(List<String> unsorted) {

        LambdaInterface lambdaSortFirstChar = list -> {
            list.sort((Comparator.comparingInt(o -> o.charAt(0))));
            return list;
        };

        this.sorted = lambdaSortFirstChar.display(unsorted);
    }

    public List<String> getSorted() {
        return sorted;
    }

}
