package apr.ss.assign.firstweek.dayfive.basiclambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitiateBasicLambdaClass {
    public InitiateBasicLambdaClass() {

        List<String> list = new ArrayList<>();
        list.add("ahello");
        list.add("xhell");
        list.add("chello0");
        list.add("efheo-----");
        list.add("hello ");
        list.add("jhellowsl");
        list.add("eeeejhellowsl");


        System.out.println(BasicLambdaSortEFirst.getSorted(list));
        System.out.println(BasicLambdaSortAscending.getSorted(list));
        System.out.println(BasicLambdaSortDesc.getSorted(list));
        System.out.println(BasicLambdaSortFirstChar.getSorted(list));


    }
}
