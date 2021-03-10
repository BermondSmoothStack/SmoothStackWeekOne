package apr.ss.assign.firstweek.shapes;

public class UserInputShapes implements ExecuteShape{

    public UserInputShapes(){
        handler();
    }

    @Override
    public Integer[] fetchShapeValues() {
        Integer[] values = new Integer[5];

        System.out.println("Enter the value of the LENGTH of the RECTANGLE");
        values[0] = new ShapeValuesInputHandler().getVerifiedInput();
        System.out.println("Enter the value of the WIDTH of the RECTANGLE");
        values[1] = new ShapeValuesInputHandler().getVerifiedInput();

        System.out.println("Enter the value of the BASE of the TRIANGLE");
        values[2] = new ShapeValuesInputHandler().getVerifiedInput();
        System.out.println("Enter the value of the HEIGHT of the TRIANGLE");
        values[3] = new ShapeValuesInputHandler().getVerifiedInput();

        System.out.println("Enter the value of the RADIUS of the CIRCLE");
        values[4] = new ShapeValuesInputHandler().getVerifiedInput();

        return values;
    }
}
