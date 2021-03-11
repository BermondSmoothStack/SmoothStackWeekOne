package apr.ss.assign.firstweek.filelist;

import java.util.Objects;

public abstract class File {
    protected String filename;
    protected String path;

    public File(String f, String p){
        this.filename = f;
        this.path = p;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return filename.equals(file.filename) && path.equals(file.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filename, path);
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
