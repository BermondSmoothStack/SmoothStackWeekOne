package apr.ss.assign.firstweek.weekend.lbdop;

import apr.ss.assign.firstweek.weekend.lbdop.Operation;
import org.junit.Test;


import static org.junit.Assert.*;

public class OperationTest {

    @Test
    public void operationTest() {

        String[] stub = {
                "5",
                "1 4",
                "2 5",
                "3 898",
                "1 3",
                "2 12"
        };

        String[] expected ={
                "EVEN",
                "PRIME",
                "PALINDROME",
                "ODD",
                "COMPOSITE"
        };


        for (int i = 1; i < Integer.parseInt(stub[0]); i++) {
            String[] test = stub[i].split(" ");
            Integer op = Integer.parseInt(test[0]);
            Integer in = Integer.parseInt(test[1]);
            String actual = null;
            switch (op) {
                case 1:
                    actual = Operation.isOdd().process(in);

                    break;
                case 2:
                    actual = Operation.isPrime().process(in);
                    break;
                case 3:
                    actual = Operation.isPalindrome().process(in);
                    break;
            }

            assertEquals(expected[i-1], actual);
            System.out.println(actual);
        }


    }
}