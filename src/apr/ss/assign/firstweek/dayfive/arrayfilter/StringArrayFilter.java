package apr.ss.assign.firstweek.dayfive.arrayfilter;

import java.util.List;
import java.util.stream.Collectors;

public class StringArrayFilter {

    public static List<String> filter(List<String> list){

        return list.stream().filter(StringA3Filter::isA3).collect(Collectors.toList());

    }

}
