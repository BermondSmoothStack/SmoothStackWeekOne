package apr.ss.assign.firstweek.starpattern;

public class InitializeStarPatterns {

    public InitializeStarPatterns() {
        System.out.print("Enter the length of the patterns: ");
        Integer length = new StarHeightInputHandler().getVerifiedInput();
        StarPatterns sp = new StarPatterns(length);

        sp.printPatternOne();
        sp.printPatternTwo();
        sp.printPatternThree();
        sp.printPatternFour();
    }
}
