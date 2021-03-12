package apr.ss.assign.firstweek.consumerproducer;

public class TransactionHandler {


    public TransactionHandler(Consumer consumer) {
        new Thread() {
            @Override
            public void run() {
                super.run();
                boolean success = consumerTransactionHandler(consumer);
                while (!success) {
                    success = consumerTransactionHandler(consumer);
                }
            }
        }.start();
    }

    public TransactionHandler(Producer producer) {
        new Thread() {
            @Override
            public void run() {
                super.run();
                boolean success = producerTransactionHandler(producer);
                while(!success){
                    success = producerTransactionHandler(producer);
                }
            }
        }.start();
    }

    private boolean producerTransactionHandler(Producer producer) {
        boolean transactionResult = false;
        try {
            synchronized (Market.getInstance()) {
                System.out.println("Market buying from producer...");
                transactionResult = Market.getInstance().buy(producer.produce());
                System.out.println("Current market items");
                System.out.println(Market.getInstance().getWarehouse().getShelf().toString());
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception found. Transaction.java");
        }

        return transactionResult;
    }

    private boolean consumerTransactionHandler(Consumer consumer) {
        boolean transactionResult = false;
        try {
            synchronized (Market.getInstance()) {
                System.out.println("Market selling to consumer...");
                transactionResult = consumer.consume(Market.getInstance().sell());
                System.out.println("Current market items");
                System.out.println(Market.getInstance().getWarehouse().getShelf().toString());
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception found. Transaction.java");
        }

        return transactionResult;
    }
}
