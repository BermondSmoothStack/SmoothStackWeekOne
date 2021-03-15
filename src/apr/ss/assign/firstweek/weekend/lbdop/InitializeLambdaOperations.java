package apr.ss.assign.firstweek.weekend.lbdop;

public class InitializeLambdaOperations {
    public InitializeLambdaOperations() {
        System.out.println(Operation.isOdd().process(4));
        System.out.println(Operation.isPrime().process(5));
        System.out.println(Operation.isPalindrome().process(898));
        System.out.println(Operation.isOdd().process(3));
        System.out.println(Operation.isPrime().process(12));
        System.out.println(Operation.isPalindrome().process(1786786));
    }
}
