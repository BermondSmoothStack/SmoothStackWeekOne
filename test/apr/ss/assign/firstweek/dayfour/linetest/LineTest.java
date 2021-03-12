package apr.ss.assign.firstweek.dayfour.linetest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class LineTest {
    @Rule
    public final ExpectedException ee = ExpectedException.none();

    @Test
    public void getSlopeDivideZeroTest() {
        Line l = new Line(0,0,0,0);
        ee.expect(ArithmeticException.class);
        l.getSlope();
    }

    @Test
    public void getSlopeTest() {
        Line l = new Line(1,0,0,1);
        assertEquals(-1, l.getSlope(), .0001);
    }

    @Test
    public void getDistanceTest() {
        Line l = new Line(1,0,0,1);
        assertEquals(1.4142135623731, l.getDistance(), .0001);
    }

    @Test
    public void parallelToTest() {
        Line l1 = new Line(0,5,10,5);
        Line l2 = new Line(1,1,10,1);
        assertTrue(l1.parallelTo(l2));

    }
}