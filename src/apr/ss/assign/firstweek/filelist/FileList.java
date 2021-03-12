package apr.ss.assign.firstweek.filelist;

import apr.ss.assign.firstweek.inputhandler.FileInputHandler;

import java.io.File;

public class FileList {

    public FileList(){
        FileListFile fl;
        File f = new FileInputHandler().getVerifiedInput();
        if (f.isDirectory()){
            System.out.println('h');
            fl = new DirectoryFileListFile(f.getName(), f.getPath());
            for (File item: f.listFiles()) {
                if(item.isDirectory()){
                    ((DirectoryFileListFile) fl).addContent(new DirectoryFileListFile(item.getName(), item.getAbsolutePath()));
                } else {
                    ((DirectoryFileListFile) fl).addContent(new ExecutableFileListFile(item.getName(), item.getAbsolutePath()));
                }
            }
        } else {
             fl = new ExecutableFileListFile(f.getName(), f.getAbsolutePath());
        }

        System.out.println(fl.toString());
    }
}
