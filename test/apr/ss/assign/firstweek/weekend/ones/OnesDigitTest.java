package apr.ss.assign.firstweek.weekend.ones;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class OnesDigitTest {

    @Test
    public void getOnesDigit() {

        List<Integer> listA = Arrays.asList(1,22,93);
        List<Integer> listB = Arrays.asList(16,8,886, 8, 1);
        List<Integer> listC = Arrays.asList(10,0);

        List<Integer> expectedA = Arrays.asList(1,2,3);
        List<Integer> expectedB = Arrays.asList(6,8,6,8,1);
        List<Integer> expectedC = Arrays.asList(0,0);

        assertArrayEquals(expectedA.toArray(),OnesDigit.getOnesDigit(listA).toArray());
        assertArrayEquals(expectedB.toArray(),OnesDigit.getOnesDigit(listB).toArray());
        assertArrayEquals(expectedC.toArray(),OnesDigit.getOnesDigit(listC).toArray());

    }
}