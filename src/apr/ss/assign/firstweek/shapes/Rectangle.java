package apr.ss.assign.firstweek.shapes;

public class Rectangle implements Shape{

    private final Integer length;
    private final Integer width;
    private Integer area = null;

    public Rectangle(Integer l, Integer w){
        this.length = l;
        this.width = w;
    }

    @Override
    public Integer calculateArea() {
        area = null == area? (width*length):area;
        return area;
    }

    @Override
    public String display() {
        String message = "The length of the rectangle is: "+length+".\n" +
                "The width of the rectangle is: " + width + ".\n" +
                "The area of the rectangle is: ";
        return message+calculateArea();
    }
}
