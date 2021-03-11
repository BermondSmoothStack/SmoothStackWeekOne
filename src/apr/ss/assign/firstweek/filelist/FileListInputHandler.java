package apr.ss.assign.firstweek.filelist;

import apr.ss.assign.firstweek.FileInputHandler;

public class FileListInputHandler extends FileInputHandler {


    public FileListInputHandler(){
        handler();
    }

    @Override
    public void handler() {
        this.verifiedInput = getInput();
    }


}
