package apr.ss.assign.firstweek.consumerproducer;

public class Transaction {

    public Transaction(Producer producer) {
        new TransactionHandler(producer);

    }

    public Transaction(Consumer consumer) {
        new TransactionHandler(consumer);
    }
}
