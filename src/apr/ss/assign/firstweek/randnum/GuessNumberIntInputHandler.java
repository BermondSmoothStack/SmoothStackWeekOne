package apr.ss.assign.firstweek.randnum;

import apr.ss.assign.firstweek.IntInputHandler;

public class GuessNumberIntInputHandler extends IntInputHandler {

    public GuessNumberIntInputHandler(){
         handler();
    }

    public GuessNumberIntInputHandler(Integer min, Integer max){
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

}
