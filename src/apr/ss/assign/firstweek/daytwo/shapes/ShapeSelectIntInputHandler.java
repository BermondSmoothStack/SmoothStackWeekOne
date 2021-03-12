package apr.ss.assign.firstweek.daytwo.shapes;

import apr.ss.assign.firstweek.inputhandler.IntInputHandler;

public class ShapeSelectIntInputHandler extends IntInputHandler {

    public ShapeSelectIntInputHandler(){
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
        return 1;
    }

    @Override
    public Integer getMax() {
        return 2;
    }
}
