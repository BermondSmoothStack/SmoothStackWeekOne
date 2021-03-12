package apr.ss.assign.firstweek.starpattern;

public class InitializeStarPatterns {

    public InitializeStarPatterns() {
        System.out.print("Enter the length of the patterns: ");
        Integer length = new StarHeightIntInputHandler().getVerifiedInput();
        StarPatterns sp = new StarPatterns(length);

        System.out.println(sp.printPatternOne());
        System.out.println(sp.printPatternTwo());
        System.out.println(sp.printPatternThree());
        System.out.println(sp.printPatternFour());
    }
}
