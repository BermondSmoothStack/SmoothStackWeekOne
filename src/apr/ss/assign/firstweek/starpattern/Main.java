package apr.ss.assign.firstweek.starpattern;

public class Main {

    public static void main(String[] args) {
        Integer length = Integer.valueOf(args[0]);
        StarPatterns sp = new StarPatterns(length);

        sp.printPatternOne();
        sp.printPatternTwo();
        sp.printPatternThree();
        sp.printPatternFour();
    }
}
