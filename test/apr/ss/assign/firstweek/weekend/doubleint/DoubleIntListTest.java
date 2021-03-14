package apr.ss.assign.firstweek.weekend.doubleint;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DoubleIntListTest {

    @Test
    public void doubleList() {

        Integer[] inputA = {1,2,3};
        Integer[] inputB = {6,8,6,8,-1};
        Integer[] inputC = {};

        Integer[] expectedA = {2,4,6};
        Integer[] expectedB = {12,16,12,16,-2};
        Integer[] expectedC = {};

        assertArrayEquals(expectedA, DoubleIntList.doubleList(Arrays.asList(inputA)).toArray());
        assertArrayEquals(expectedB, DoubleIntList.doubleList(Arrays.asList(inputB)).toArray());
        assertArrayEquals(expectedC, DoubleIntList.doubleList(Arrays.asList(inputC)).toArray());
    }
}