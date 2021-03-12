package apr.ss.assign.firstweek.daythree.charlookup;

import apr.ss.assign.firstweek.inputhandler.StringInputHandler;
import apr.ss.assign.firstweek.daythree.fileappend.FileAppendInputHandler;

import java.io.FileReader;
import java.io.IOException;

public class InitializeCharLookup {

    public InitializeCharLookup() throws IOException {
        FileAppendInputHandler f = new FileAppendInputHandler();
        StringInputHandler si = new StringInputHandler();

        System.out.print("Enter target character(Only first character of the string given will be taken):");
        Character target = si.getVerifiedInput().charAt(0);

        FileReader r = new FileReader(f.getVerifiedInput().getAbsolutePath());
        int c = 0, i;
        while((i = r.read())!=-1){
            if (target.equals((char)i)){
                c++;
            }
        }

        System.out.println("Total number of "+target+" in file is: "+c);
    }

}
