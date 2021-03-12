package apr.ss.assign.firstweek.dayfour.consumerproducer;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProducerTest {

    @Test
    public void produceTest() throws InterruptedException {
        int min = 0;
        int max = 999;
        Integer mynum = new Producer().produce();
        assertTrue(min <= mynum && mynum <= max);
    }
}