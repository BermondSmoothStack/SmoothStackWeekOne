package apr.ss.assign.firstweek.maxindex;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Generate2DArray array = new Generate2DArray(5);
        ArraySumFinder sum = new ArraySumFinder(array.getArray());
        ArrayMaxFinder biggest = new ArrayMaxFinder(array.getArray());
        System.out.println("The array is: " + Arrays.deepToString(array.getArray()));
        System.out.println("The sum of all the array values is: " + sum.getArraySum());
        System.out.println("The index of all biggest array value is: " + Arrays.toString(biggest.getCoordinates()));

    }

}
