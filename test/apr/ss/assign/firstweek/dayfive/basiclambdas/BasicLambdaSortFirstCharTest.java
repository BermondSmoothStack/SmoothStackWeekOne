package apr.ss.assign.firstweek.dayfive.basiclambdas;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BasicLambdaSortFirstCharTest {

    @Test
    public void getSortedFirstCharTest() {
        List<String> list = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        list.add("l00004");
        list.add("e200");
        list.add("y500000");
        list.add("j3000");
        list.add("a01");

        expected.add("a01");
        expected.add("e200");
        expected.add("j3000");
        expected.add("l00004");
        expected.add("y500000");

        List<String> actual =  BasicLambdaSortFirstChar.getSorted(list);
        assertArrayEquals(expected.toArray(new String[0]), actual.toArray(new String[0]));
    }
}