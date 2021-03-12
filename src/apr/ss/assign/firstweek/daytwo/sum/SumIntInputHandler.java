package apr.ss.assign.firstweek.daytwo.sum;

import apr.ss.assign.firstweek.inputhandler.IntInputHandler;

public class SumIntInputHandler extends IntInputHandler {

    public SumIntInputHandler(){
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
        return 999;
    }
}
