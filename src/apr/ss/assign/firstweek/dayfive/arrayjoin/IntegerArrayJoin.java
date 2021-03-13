package apr.ss.assign.firstweek.dayfive.arrayjoin;

import java.util.List;
import java.util.stream.Collectors;

public class IntegerArrayJoin {

    public static String join(List<Integer> list) {
        List<String> strings = list.stream().map((OddEven::tagInt)).collect(Collectors.toList());
        return String.join(", ", strings);
    }
}
