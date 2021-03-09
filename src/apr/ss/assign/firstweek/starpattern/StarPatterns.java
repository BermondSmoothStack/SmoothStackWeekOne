package apr.ss.assign.firstweek.starpattern;

public class StarPatterns {

    private final Integer length;

    public StarPatterns(Integer length){
        this.length = length-1;
    }

    public void printPatternOne(){
        String header = "1)\n";
        StringBuilder content = new StringBuilder(header);

        for(int height = 0; height <= length; height++){
            for (int width = 0; width <= height; width++){
                content.append('*');
            }
            content.append('\n');
        }

        System.out.println(content.toString());

    }

    public void printPatternTwo(){
        String header = "2)\n";
        StringBuilder content = new StringBuilder(header);

        for(int height = 0; height <= length; height++){
            for (int width = length; width >= height; width--){
                content.append('*');
            }
            content.append('\n');
        }

        System.out.println(content.toString());
    }

    public void printPatternThree(){
        String header = "3)\n";
        StringBuilder content = new StringBuilder(header);

        for(int height = 0; height <= length; height++){

            content.append(buildPyramid(height));
            content.append('\n');
        }

        System.out.println(content.toString());
    }

    public void printPatternFour(){
        String header = "4)\n";
        StringBuilder content = new StringBuilder(header);

        for(int height = length; height >= 0; height--){

            content.append(buildPyramid(height));
            content.append('\n');
        }

        System.out.println(content.toString());
    }

    private String buildPyramid(Integer height){
        StringBuilder content = new StringBuilder();

        int spaces = length-height;

        for(int frontSpaces = spaces; frontSpaces > 0; frontSpaces--){
            content.append(' ');
        }

        for(int stars = (height*2)+1; stars > 0; stars--){
            content.append('*');
        }

        for(int backSpaces = spaces; backSpaces > 0; backSpaces--){
            content.append(' ');
        }

        return content.toString();

    }
}
