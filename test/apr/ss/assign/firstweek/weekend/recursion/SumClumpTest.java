package apr.ss.assign.firstweek.weekend.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumClumpTest {

    @Test
    public void groupSumClumpTest() {
        Integer[] groupA = {2,4,8};
        Integer[] groupB = {1, 2, 4, 8, 1};
        Integer[] groupC = {2,4,4,8};

        assertTrue(SumClump.groupSumClump(0, groupA, 10));
        assertTrue(SumClump.groupSumClump(0, groupB, 14));
        assertFalse(SumClump.groupSumClump(0, groupC, 14));

    }
}