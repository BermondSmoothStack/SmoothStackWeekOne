package apr.ss.assign.firstweek;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class FileInputHandler implements IInputHandler{

    protected File verifiedInput;

    public File getInput() {
        System.out.println("Please enter a path to a directory/file:");
        File f = new File(scanInput());

        if (!f.exists()){
            System.out.println("File does not exist, try again:");
            f = getInput();
        }

        return f;
    }

    public String scanInput(){
        Scanner input = new Scanner(System.in);
        String strInput;

        try {
            strInput = input.next();
        } catch (InputMismatchException e){
            System.out.println("Please enter a String");
            strInput = scanInput();
        }

        return strInput;
    }

    public File getVerifiedInput(){ return verifiedInput;}


}
