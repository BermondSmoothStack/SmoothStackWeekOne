package apr.ss.assign.firstweek.inputhandler;

public class FileInputHandler extends AFileInputHandler {


    public FileInputHandler(){
        handler();
    }

    @Override
    public void handler() {
        System.out.println('b');
        this.verifiedInput = getInput();
    }


}
