package apr.ss.assign.firstweek.starpattern;

import apr.ss.assign.firstweek.inputhandler.IntInputHandler;

public class StarHeightIntInputHandler extends IntInputHandler {

    public StarHeightIntInputHandler(){
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
        return 100;
    }
}
