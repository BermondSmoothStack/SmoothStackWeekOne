package apr.ss.assign.firstweek.daytwo.shapes;

public class InitializeShapes {

    public InitializeShapes() {

        System.out.println("Would you like to randomize all the shape values?\n[1] Yes\n[2] No");
        ShapeSelectIntInputHandler input = new ShapeSelectIntInputHandler();

        if (input.getVerifiedInput().equals(1)){
            new RandomizedShapes();
        } else {
            new UserInputShapes();
        }

    }

}
