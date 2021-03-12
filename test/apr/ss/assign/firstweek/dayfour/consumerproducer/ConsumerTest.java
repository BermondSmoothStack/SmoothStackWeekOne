package apr.ss.assign.firstweek.dayfour.consumerproducer;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ConsumerTest {

    @Test
    public void consumeTest() throws InterruptedException {
        boolean success = new Consumer().consume(1);
        assertTrue(success);
    }

    @Test
    public void consumeInvalidTest() throws InterruptedException {
        boolean success = new Consumer().consume(-1);
        assertFalse(success);
    }
}
