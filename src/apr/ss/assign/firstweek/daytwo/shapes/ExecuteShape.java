package apr.ss.assign.firstweek.daytwo.shapes;

public interface ExecuteShape {
    Integer[] fetchShapeValues();

    default void handler(){
        Integer[] values = fetchShapeValues();
        System.out.println(new Rectangle(values[0], values[1]).display());
        System.out.println();
        System.out.println(new Triangle(values[2], values[3]).display());
        System.out.println();
        System.out.println(new Circle(values[4]).display());
    }
}
