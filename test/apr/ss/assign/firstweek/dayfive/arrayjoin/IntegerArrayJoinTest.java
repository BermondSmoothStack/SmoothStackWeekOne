package apr.ss.assign.firstweek.dayfive.arrayjoin;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class IntegerArrayJoinTest {

    @Test
    public void joinTest() {
        String actual = IntegerArrayJoin.join(Arrays.asList(12,13,25,46,0,-1));
        String expected = "e12, o13, o25, e46, e0, o-1";

        assertEquals(expected, actual);
    }
}