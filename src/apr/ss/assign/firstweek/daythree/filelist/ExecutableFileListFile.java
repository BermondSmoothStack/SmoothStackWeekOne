package apr.ss.assign.firstweek.daythree.filelist;

public class ExecutableFileListFile extends FileListFile {

    public ExecutableFileListFile(String f, String p) {
        super(f, p);
    }

    @Override
    protected boolean isExecutable() {
        return true;
    }
}
