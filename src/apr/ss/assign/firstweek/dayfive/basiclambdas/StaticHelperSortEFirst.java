package apr.ss.assign.firstweek.dayfive.basiclambdas;

import java.util.Comparator;

public class StaticHelperSortEFirst  {

    public static int compare(String o1, String o2){
        return o2.charAt(0) == o1.charAt(0) ? 0 : o1.charAt(0) == 'e' ? -1 : 1;

    }

}
