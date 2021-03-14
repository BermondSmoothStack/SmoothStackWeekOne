package apr.ss.assign.firstweek.weekend.lbdop;

public class Operation {

    public static IPerformOperation<Integer> isOdd() {
        return o -> (o % 2) != 0 ? "ODD" : "EVEN";
    }

    public static IPerformOperation<Integer> isPrime() {

        return o -> {
            if (o == 0 || o == 1 || o % 2 == 0) {
                return "COMPOSITE";
            }
            o = Math.abs(o);

            for (int j = 3; j < o; j++) {
                if (o % j == 0)
                    return "COMPOSITE";
            }
            return "PRIME";
        };

    }

    public static IPerformOperation<Integer> isPalindrome() {
        return o -> Integer.toString(o)
                .contentEquals(new StringBuffer(Integer.toString(o)).reverse()) ? "PALINDROME" : "NOT PALINDROME";
    }

}
