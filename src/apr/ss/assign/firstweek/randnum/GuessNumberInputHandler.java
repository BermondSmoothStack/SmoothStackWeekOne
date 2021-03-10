package apr.ss.assign.firstweek.randnum;

import apr.ss.assign.firstweek.InputHandler;

public class GuessNumberInputHandler implements InputHandler {
    private Integer verifiedInput;
    private Integer min = 0;
    private Integer max = 100;


    public GuessNumberInputHandler(){
         handler();
    }

    public GuessNumberInputHandler(Integer min, Integer max){
        this.min = min;
        this.max = max;

        handler();
    }

    @Override
    public void handler(){
        verifiedInput = getInput();

    }

    @Override
    public Integer getMin() {
        return min;
    }

    @Override
    public Integer getMax() {
        return max;
    }

    public Integer getVerifiedInput(){
        return verifiedInput;
    }
}
