package apr.ss.assign.firstweek.sum;

import java.util.ArrayList;

public class InitializeSum {

    public InitializeSum(){
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("How many numbers would you like to enter? ");

        SumInputHandler inputLength = new SumInputHandler();

        for (int i = 1; i < inputLength.getVerifiedInput()+1; i++) {
            System.out.print("Enter number #"+i+": ");
            list.add(new SumInputHandler().getVerifiedInput());
            System.out.println();
        }

        System.out.println(new FindSum(list).getSum());
    }

}
