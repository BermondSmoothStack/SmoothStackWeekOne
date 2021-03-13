package apr.ss.assign.firstweek.dayfive.basiclambdas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BasicLambdaStaticHelperTest {

    @Test
    public void getSortedStaticHelperTest() {
        List<String> list = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        list.add("e00004");
        list.add("200");
        list.add("e500000");
        list.add("3000");
        list.add("01");

        expected.add("e00004");
        expected.add("e500000");
        expected.add("200");
        expected.add("3000");
        expected.add("01");

        List<String> actual = new BasicLambdaStaticHelper(list).getSorted();
        assertArrayEquals(expected.toArray(new String[0]), actual.toArray(new String[0]));
    }
}