package apr.ss.assign.firstweek.dayfive.arrayfilter;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StringA3FilterTest {

    @Test
    public void isA3TrueTest() {
        assertTrue(StringA3Filter.isA3("a23"));
    }

    @Test
    public void isA3FalseTest(){
        assertFalse(StringA3Filter.isA3("b23"));
        assertFalse(StringA3Filter.isA3("a234"));
        assertFalse(StringA3Filter.isA3("a2"));
        assertFalse(StringA3Filter.isA3(""));
    }
}