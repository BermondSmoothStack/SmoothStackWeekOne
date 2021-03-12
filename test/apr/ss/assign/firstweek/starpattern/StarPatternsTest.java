package apr.ss.assign.firstweek.starpattern;

import org.junit.Assert;
import org.junit.Test;

public class StarPatternsTest {

    @Test
    public void StarPatternOneZeroInputTest(){
        StarPatterns sptest = new StarPatterns(0);
        String expected = "1)\n";
        Assert.assertEquals(expected, sptest.printPatternOne());
    }

    @Test
    public void StarPatternOnePositiveInputTest(){
        StarPatterns sptest1 = new StarPatterns(3);
        StarPatterns sptest2 = new StarPatterns(5);
        String expected1 = "1)\n*\n**\n***\n";
        String expected2 = "1)\n*\n**\n***\n****\n*****\n";
        Assert.assertEquals(expected1, sptest1.printPatternOne());
        Assert.assertEquals(expected2, sptest2.printPatternOne());
    }

    @Test
    public void StarPatternTwoZeroInputTest(){
        StarPatterns sptest = new StarPatterns(0);
        String expected = "2)\n";
        Assert.assertEquals(expected, sptest.printPatternTwo());
    }

    @Test
    public void StarPatternTwoPositiveInputTest(){
        StarPatterns sptest1 = new StarPatterns(3);
        StarPatterns sptest2 = new StarPatterns(5);
        String expected1 = "2)\n***\n**\n*\n";
        String expected2 = "2)\n*****\n****\n***\n**\n*\n";
        Assert.assertEquals(expected1, sptest1.printPatternTwo());
        Assert.assertEquals(expected2, sptest2.printPatternTwo());
    }

    @Test
    public void StarPatternThreeZeroInputTest(){
        StarPatterns sptest = new StarPatterns(0);
        String expected = "3)\n";
        Assert.assertEquals(expected, sptest.printPatternThree());
    }

    @Test
    public void StarPatternThreePositiveInputTest(){
        StarPatterns sptest1 = new StarPatterns(3);
        StarPatterns sptest2 = new StarPatterns(5);
        String expected1 = "3)\n  *  \n *** \n*****\n";
        String expected2 = "3)\n    *    \n   ***   \n  *****  \n ******* \n*********\n";
        Assert.assertEquals(expected1, sptest1.printPatternThree());
        Assert.assertEquals(expected2, sptest2.printPatternThree());
    }

    @Test
    public void StarPatternFourZeroInputTest(){
        StarPatterns sptest = new StarPatterns(0);
        String expected = "4)\n";
        Assert.assertEquals(expected, sptest.printPatternFour());
    }

    @Test
    public void StarPatternFourPositiveInputTest(){
        StarPatterns sptest1 = new StarPatterns(3);
        StarPatterns sptest2 = new StarPatterns(5);
        String expected1 = "4)\n*****\n *** \n  *  \n";
        String expected2 = "4)\n*********\n ******* \n  *****  \n   ***   \n    *    \n";
        Assert.assertEquals(expected1, sptest1.printPatternFour());
        Assert.assertEquals(expected2, sptest2.printPatternFour());
    }

    @Test
    public void StarPatternOneNegativeInputTest(){
        StarPatterns sptest1 = new StarPatterns(-3);
        StarPatterns sptest2 = new StarPatterns(-5);
        Assert.assertEquals("1)\n",sptest1.printPatternOne());
        Assert.assertEquals("1)\n",sptest2.printPatternOne());
    }

    @Test
    public void StarPatternTwoNegativeInputTest(){
        StarPatterns sptest1 = new StarPatterns(-3);
        StarPatterns sptest2 = new StarPatterns(-5);
        Assert.assertEquals("2)\n",sptest1.printPatternTwo());
        Assert.assertEquals("2)\n",sptest2.printPatternTwo());
    }

    @Test
    public void StarPatternThreeNegativeInputTest(){
        StarPatterns sptest1 = new StarPatterns(-3);
        StarPatterns sptest2 = new StarPatterns(-5);
        Assert.assertEquals("3)\n",sptest1.printPatternThree());
        Assert.assertEquals("3)\n",sptest2.printPatternThree());
    }

    @Test
    public void StarPatternFourNegativeInputTest(){
        StarPatterns sptest1 = new StarPatterns(-3);
        StarPatterns sptest2 = new StarPatterns(-5);
        Assert.assertEquals("4)\n",sptest1.printPatternFour());
        Assert.assertEquals("4)\n",sptest2.printPatternFour());
    }
}
