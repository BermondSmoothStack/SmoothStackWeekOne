package apr.ss.assign.firstweek.sum;

import apr.ss.assign.firstweek.InputHandler;

public class SumInputHandler implements InputHandler {

    private Integer verifiedInput;

    public SumInputHandler(){
        handler();
    }

    @Override
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
