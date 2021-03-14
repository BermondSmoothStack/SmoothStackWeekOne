package apr.ss.assign.firstweek.weekend.nox;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyStringTest {

    @Test
    public void noX() {
        String[] stringA = {"ax", "bb", "cx"};
        String[] stringB = {"xxax", "xbxbx", "xxcx"};
        String[] stringC = {};

        String[] expectedA = {"a", "bb", "c"};
        String[] expectedB = {"a", "bb", "c"};
        String[] expectedC = {};

        String[] actualA = MyString.noX(stringA);
        String[] actualB = MyString.noX(stringB);
        String[] actualC = MyString.noX(stringC);

        assertArrayEquals(expectedA, actualA);
        assertArrayEquals(expectedB, actualB);
        assertArrayEquals(expectedC, actualC);

    }
}