package apr.ss.assign.firstweek.shapes;

import apr.ss.assign.firstweek.InputHandler;

public class ShapeSelectInputHandler implements InputHandler {
    private Integer verifiedInput;

    public ShapeSelectInputHandler(){
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
        return 2;
    }
}
