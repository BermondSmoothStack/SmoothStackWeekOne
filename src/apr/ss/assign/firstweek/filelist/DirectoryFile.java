package apr.ss.assign.firstweek.filelist;

import java.util.List;

public class DirectoryFile extends File{

    protected List<File> content;

    public DirectoryFile(String f, String p) {
        super(f, p);
    }

    public List<File> getContent() {
        return content;
    }

    public void setContent(Object content) {

    }

    @Override
    protected boolean isExecutable() {
        return false;
    }
}
