package apr.ss.assign.firstweek.dayfive.basiclambdas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BasicLambdaSortDescTest {

    @Test
    public void getSortedDescTest() {
        List<String> list = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        list.add("00004");
        list.add("200");
        list.add("500000");
        list.add("01");
        list.add("3000");

        expected.add("500000");
        expected.add("00004");
        expected.add("3000");
        expected.add("200");
        expected.add("01");

        List<String> actual = new BasicLambdaSortDesc(list).getSorted();
        assertArrayEquals(expected.toArray(new String[0]), actual.toArray(new String[0]));
    }
}