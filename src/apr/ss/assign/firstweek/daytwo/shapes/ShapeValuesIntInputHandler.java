package apr.ss.assign.firstweek.daytwo.shapes;

import apr.ss.assign.firstweek.inputhandler.IntInputHandler;

public class ShapeValuesIntInputHandler extends IntInputHandler {

    public ShapeValuesIntInputHandler(){
        handler();
    }

    public Integer getVerifiedInput() {
        return verifiedInput;
    }

    @Override
    public void handler() {
        verifiedInput = getInput();
    }

    @Override
    public Integer getMin() {
        return 0;
    }

    @Override
    public Integer getMax() {
        return 100;
    }
}
