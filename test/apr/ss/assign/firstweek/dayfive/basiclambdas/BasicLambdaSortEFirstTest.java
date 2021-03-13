package apr.ss.assign.firstweek.dayfive.basiclambdas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BasicLambdaSortEFirstTest {

    @Test
    public void getSortedEFirstTest() {
        List<String> list = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        list.add("00004");
        list.add("e200");
        list.add("500000");
        list.add("e3000");
        list.add("01");

        expected.add("e200");
        expected.add("e3000");
        expected.add("00004");
        expected.add("500000");
        expected.add("01");

        List<String> actual = BasicLambdaSortEFirst.getSorted(list);
        assertArrayEquals(expected.toArray(new String[0]), actual.toArray(new String[0]));
    }
}