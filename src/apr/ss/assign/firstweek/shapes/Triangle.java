package apr.ss.assign.firstweek.shapes;

public class Triangle implements Shape{

    private final Integer b;
    private final Integer h;
    private Integer area = null;

    public Triangle(Integer b, Integer h){
        this.b = b;
        this.h = h;
    }

    @Override
    public Integer calculateArea() {
        area = null == area? (b*h)/2:area;
        return area;
    }

    @Override
    public String display() {
        String message = "The base of the triangle is: "+ b +".\n" +
                "The height of the triangle is: " + h + ".\n" +
                "The area of the triangle is: ";
        return message+calculateArea();
    }
}
