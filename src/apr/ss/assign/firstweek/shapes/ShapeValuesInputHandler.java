package apr.ss.assign.firstweek.shapes;

import apr.ss.assign.firstweek.InputHandler;

public class ShapeValuesInputHandler implements InputHandler {

    private Integer verifiedInput;

    public ShapeValuesInputHandler(){
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
        return 0;
    }

    @Override
    public Integer getMax() {
        return 100;
    }
}
