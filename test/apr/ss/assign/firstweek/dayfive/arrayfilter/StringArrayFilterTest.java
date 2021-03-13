package apr.ss.assign.firstweek.dayfive.arrayfilter;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StringArrayFilterTest {

    @Test
    public void filterTest() {
        List<String> input = Arrays.asList("c234", "b23", "a234", "a33", "b234", "c23", "a00");
        List<String> expected = Arrays.asList("a33", "a00");

        List<String> actual = StringArrayFilter.filter(input);

        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}