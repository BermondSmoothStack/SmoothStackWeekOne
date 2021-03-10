package apr.ss.assign.firstweek;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface InputHandler {

    Object getVerifiedInput();

    default Integer scanInput(){
        Scanner input = new Scanner(System.in);
        Integer intInput;

        try {
            intInput = input.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Please enter an integer");
            intInput = scanInput();
        }

        return intInput;
    }

    default Integer getInput(){
        int unverifiedIntInput = scanInput();

        while (!verifyInputRange(unverifiedIntInput)) {
            System.out.println("Please enter an integer between["+getMin()+", "+getMax()+"]");
            unverifiedIntInput = scanInput();
        }

        return unverifiedIntInput;
    }

    void handler();
    default boolean verifyInputRange(Integer input){
        return ((input >= getMin()) && (input <= getMax()));
    }
    Integer getMin();
    Integer getMax();

}
