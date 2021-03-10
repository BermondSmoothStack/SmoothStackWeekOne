package apr.ss.assign.firstweek.shapes;

public class Circle implements Shape{

    private final Integer r;
    private Integer area = null;

    public Circle(Integer r){
        this.r = r;
    }

    @Override
    public Integer calculateArea() {
        Double a = (Math.PI*(r*r));
        area = null == area? a.intValue() : area;
        return area;
    }

    @Override
    public String display() {
        String message = "The radius of the circle is: "+r+".\n" +
                "The area of the rectangle is: ";
        return message+calculateArea();
    }
}
