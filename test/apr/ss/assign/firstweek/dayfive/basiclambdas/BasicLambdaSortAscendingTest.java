package apr.ss.assign.firstweek.dayfive.basiclambdas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BasicLambdaSortAscendingTest {

    @Test
    public void getSortedLengthAscendingTest() {
        List<String> list = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        list.add("00004");
        list.add("200");
        list.add("500000");
        list.add("3000");
        list.add("01");

        expected.add("01");
        expected.add("200");
        expected.add("3000");
        expected.add("00004");
        expected.add("500000");

        List<String> actual = new BasicLambdaSortAscending(list).getSorted();
        assertArrayEquals(expected.toArray(new String[0]), actual.toArray(new String[0]));


    }
}