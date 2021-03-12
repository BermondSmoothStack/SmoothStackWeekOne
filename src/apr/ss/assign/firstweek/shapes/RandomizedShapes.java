package apr.ss.assign.firstweek.shapes;

import apr.ss.assign.firstweek.generatenumber.GenerateNumber;

public class RandomizedShapes implements ExecuteShape {

    public RandomizedShapes(){
        handler();
    }

    @Override
    public Integer[] fetchShapeValues(){
        Integer[] values = new Integer[5];
        for (int i = 0; i < 5; i++) {
            values[i] = (new GenerateNumber()).randomNumber;
        }

        return values;
    }
}
