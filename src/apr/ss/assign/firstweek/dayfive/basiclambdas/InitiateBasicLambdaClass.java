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


        System.out.println(new BasicLambdaSortEFirst(list).getSorted());
        System.out.println(new BasicLambdaSortAscending(list).getSorted());
        System.out.println(new BasicLambdaSortDesc(list).getSorted());
        System.out.println(new BasicLambdaSortFirstChar(list).getSorted());
        System.out.println(new BasicLambdaStaticHelper(list).getSorted());


    }
}
