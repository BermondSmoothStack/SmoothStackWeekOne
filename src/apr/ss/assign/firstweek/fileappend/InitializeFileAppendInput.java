package apr.ss.assign.firstweek.fileappend;

import apr.ss.assign.firstweek.StringInputHandler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class InitializeFileAppendInput {

    public InitializeFileAppendInput() throws IOException {
        FileAppendInputHandler f = new FileAppendInputHandler();
        System.out.println("Please enter the text to be appended.");
        String text = new StringInputHandler().getVerifiedInput();
        Files.write(Paths.get(f.getVerifiedInput().getAbsolutePath()), text.getBytes(), StandardOpenOption.APPEND);
    }

}
