package apr.ss.assign.firstweek.consumerproducer;

public class InitializeTransaction {

    public InitializeTransaction() {
        new Transaction(new Consumer());
        new Transaction(new Producer());
        new Transaction(new Consumer());
        new Transaction(new Producer());

    }
}
