package apr.ss.assign.firstweek.fileappend;

import apr.ss.assign.firstweek.FileInputHandler;

import java.io.File;

public class FileAppendInputHandler extends FileInputHandler {

    protected File verifiedInput;

    public FileAppendInputHandler(){
        super();
    }

    @Override
    public File getInput(){
        File f = super.getInput();
        if (!f.canWrite() || f.isDirectory()){
            System.out.println("File cannot be overwritten, enter a new path.");
            this.getInput();
        }
        return f;
    }

    @Override
    public void handler(){
        System.out.println('a');
        verifiedInput = this.getInput();
    }

    @Override
    public File getVerifiedInput() {
        return verifiedInput;
    }
}
