package apr.ss.assign.firstweek.randnum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {
    private Integer min = 0;
    private Integer max = 100;
    private Integer verifiedInput;

    public InputHandler(){
        handler();
    }

    public InputHandler(Integer min, Integer max){
        this.min = min;
        this.max = max;

        handler();
    }

    private void handler(){
        int unverifiedIntInput = scanIntInput();

        while (!verifyInputRange(unverifiedIntInput)) {
            System.out.println("Please enter an integer between["+min+", "+max+"]");
            unverifiedIntInput = scanIntInput();
        }

        verifiedInput = unverifiedIntInput;
    }

    private Integer scanIntInput() {
        Scanner input = new Scanner(System.in);
        Integer intInput;

        try {
            intInput = input.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Please enter an integer");
            intInput = scanIntInput();
        }

        return intInput;
    }

    private boolean verifyInputRange(Integer input){
        return ((input >= min) && (input <= max));
    }

    public int getVerifiedInput(){
        return verifiedInput;
    }
}
