package apr.ss.assign.firstweek.dayfive.basiclambdas;

import java.util.Arrays;
import java.util.List;

public class BasicLambdaStaticHelper implements BasicLambdaSort {

    private final List<String> sorted;

    public BasicLambdaStaticHelper(List<String> unsorted) {

        String[] unsortedArray = unsorted.toArray(new String[0]);
        Arrays.sort(unsortedArray, StaticHelperSortEFirst::compare); // Static helper converted to :: notation. Was (s1,s2)->StaticHelperSortEFirst.compare(s1,s2)
        this.sorted = Arrays.asList(unsortedArray.clone());
    }

    @Override
    public List<String> getSorted() {
        return sorted;
    }
}
