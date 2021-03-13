package apr.ss.assign.firstweek.dayfive.arrayjoin;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenTest {

    @Test
    public void tagIntTestEven() {
        assertEquals("e23124", OddEven.tagInt(23124));
        assertEquals("e0", OddEven.tagInt(0));
    }

    @Test
    public void tagIntTestOdd(){
        assertEquals("o23125", OddEven.tagInt(23125));
        assertEquals("o-1", OddEven.tagInt(-1));

    }
}