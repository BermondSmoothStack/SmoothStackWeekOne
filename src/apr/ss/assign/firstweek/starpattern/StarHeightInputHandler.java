package apr.ss.assign.firstweek.starpattern;

import apr.ss.assign.firstweek.InputHandler;

public class StarHeightInputHandler implements InputHandler {

    private Integer verifiedInput;

    public StarHeightInputHandler(){
        handler();
    }

    @Override
    public Integer getVerifiedInput() {
        return verifiedInput;
    }

    @Override
    public void handler() {
        verifiedInput = scanInput();
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
