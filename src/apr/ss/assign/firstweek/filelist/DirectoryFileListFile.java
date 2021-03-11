package apr.ss.assign.firstweek.filelist;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DirectoryFileListFile extends FileListFile {

    protected List<FileListFile> content;

    public DirectoryFileListFile(String f, String p) {
        super(f, p);
    }
    public DirectoryFileListFile(FileListFile f) {
        super(f);
    }

    public List<FileListFile> getContent() {
        return content;
    }

    public void setContent(List<FileListFile> content) {
        this.content = content;
    }


    public void addContent(FileListFile fileList){
        if (null == content){
            content = new ArrayList<>();
        }
        if (fileList.isExecutable())
            content.add(fileList);
        else {
            DirectoryFileListFile df = new DirectoryFileListFile(fileList);
            File f = new File(df.path);
            for (File item : f.listFiles()) {
                if (item.isDirectory()) {
                    DirectoryFileListFile ddf = new DirectoryFileListFile(item.getName(), item.getAbsolutePath());
                    df.addContent(ddf);
                } else {
                    df.addContent(new ExecutableFileListFile(item.getName(), item.getAbsolutePath()));
                }
            }
            content.add(df);
        }
        Collections.sort(content);
    }

    @Override
    public String toString(){
        StringBuilder out = new StringBuilder();
        for (FileListFile fl: content) {
            if (fl.isExecutable()){
                out.append(fl.filename);
            } else {
                out.append("└");
                out.append(fl.filename);
                DirectoryFileListFile df = (DirectoryFileListFile) fl;
                out.append(df.toString(1));
            }
        }

        return out.toString();
    }

    public String toString(int tabs){
        StringBuilder out = new StringBuilder();
        if (null == content)
            return "";
        for (FileListFile fl: content) {
            if (fl.isExecutable()){
                out.append('\n');
                for (int i = 0; i < tabs; i++) {
                    out.append('\t');
                }
                out.append(fl.filename);
            } else {
                out.append('\n');
                for (int i = 0; i < tabs; i++) {
                    out.append('\t');
                }
                out.append("└");
                out.append(fl.filename);
                DirectoryFileListFile df = (DirectoryFileListFile) fl;
                out.append(df.toString(tabs+1));

            }
        }

        return out.toString();
    }

    @Override
    protected boolean isExecutable() {
        return false;
    }
}
