package apr.ss.assign.firstweek.daytwo.maxindex;

public class ArrayMaxFinder {

    private Integer[][] array;
    private Integer[] coordinates;

    public ArrayMaxFinder (Integer[][] array){
        this.array = array;

        coordinates = findBiggestNumberCoordinates();
    }

    private Integer[] findBiggestNumberCoordinates(){
        Integer[] coordintes = new Integer[2];
        Integer biggest = -1;

        int x = 0;
        for (Integer[] i : array) {
            int y = 0;
            for (Integer j : i) {
                if (j > biggest){
                    biggest = j;
                    coordintes[0] = x;
                    coordintes[1] = y;
                }
                y++;
            }
            x++;
        }

        return coordintes;
    }

    public Integer[] getCoordinates() {
        return coordinates;
    }
}
