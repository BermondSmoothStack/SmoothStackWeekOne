package apr.ss.assign.firstweek.weekend.nox;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MyString {

    public static String[] noX(String[] strings) {
        return Arrays.stream(strings)
                .map(s->s.replaceAll("x", ""))
                .collect(Collectors.toList())
                .toArray(strings);
    }
}
