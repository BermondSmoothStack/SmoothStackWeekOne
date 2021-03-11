package apr.ss.assign.firstweek.filelist;

public class ExecutableFile extends File{

    public ExecutableFile(String f, String p) {
        super(f, p);
    }

    @Override
    protected boolean isExecutable() {
        return true;
    }
}
