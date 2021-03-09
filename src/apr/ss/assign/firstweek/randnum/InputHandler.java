package apr.ss.assign.firstweek.randnum;

import java.util.Scanner;

public class InputHandler {
    private int min = 0;
    private int max = 100;
    private int verifiedInput;

    public InputHandler(){
        handler();
    }

    public InputHandler(int min, int max){
        this.min = min;
        this.max = max;

        handler();
    }

    private void handler(){
        Scanner input = new Scanner(System.in);
        int unverifiedInput = input.nextInt();
        while (!verifyInput(unverifiedInput)) {
            System.out.println("Please enter an integer between ["+min+", "+max+"]");
            unverifiedInput = input.nextInt();
        }

        verifiedInput = unverifiedInput;
    }


    private boolean verifyInput(int input){
        return ((input >= min) && (input <= max));
    }

    public int getVerifiedInput(){
        return verifiedInput;
    }
}
