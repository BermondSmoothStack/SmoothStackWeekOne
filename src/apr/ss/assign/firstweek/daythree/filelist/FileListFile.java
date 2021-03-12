package apr.ss.assign.firstweek.daythree.filelist;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public abstract class FileListFile implements Comparable<FileListFile>{
    protected String filename;
    protected String path;

    public FileListFile(String f, String p){
        this.filename = f;
        this.path = p;
    }

    public FileListFile(FileListFile f){
        this.filename = f.filename;
        this.path = f.path;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileListFile fileListFile = (FileListFile) o;
        return filename.equals(fileListFile.filename) && path.equals(fileListFile.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filename, path);
    }

    @Override
    public String toString(){
        return filename;
    }

    @Override
    public int compareTo(@NotNull FileListFile o) {
        return o.isExecutable()? -1:0;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    protected abstract boolean isExecutable();

}
