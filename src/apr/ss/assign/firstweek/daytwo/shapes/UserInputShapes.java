package apr.ss.assign.firstweek.daytwo.shapes;

public class UserInputShapes implements ExecuteShape{

    public UserInputShapes(){
        handler();
    }

    @Override
    public Integer[] fetchShapeValues() {
        Integer[] values = new Integer[5];

        System.out.println("Enter the value of the LENGTH of the RECTANGLE");
        values[0] = new ShapeValuesIntInputHandler().getVerifiedInput();
        System.out.println("Enter the value of the WIDTH of the RECTANGLE");
        values[1] = new ShapeValuesIntInputHandler().getVerifiedInput();

        System.out.println("Enter the value of the BASE of the TRIANGLE");
        values[2] = new ShapeValuesIntInputHandler().getVerifiedInput();
        System.out.println("Enter the value of the HEIGHT of the TRIANGLE");
        values[3] = new ShapeValuesIntInputHandler().getVerifiedInput();

        System.out.println("Enter the value of the RADIUS of the CIRCLE");
        values[4] = new ShapeValuesIntInputHandler().getVerifiedInput();

        return values;
    }
}
