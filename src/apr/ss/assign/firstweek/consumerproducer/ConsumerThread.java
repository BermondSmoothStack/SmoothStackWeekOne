package apr.ss.assign.firstweek.consumerproducer;

import java.util.Iterator;
import java.util.Queue;

public class ConsumerThread extends Thread {

    private final Queue<Consumer> consumerQueue;

    public ConsumerThread(Queue<Consumer> queue) {
        this.consumerQueue = queue;
    }

    @Override
    public void run() {
        super.run();
        Iterator<Consumer> itr = consumerQueue.iterator();

        while(itr.hasNext()) {
            Consumer consumer = itr.next();
            boolean success = consumerTransactionHandler(consumer);
            while (!success) {
                success = consumerTransactionHandler(consumer);
            }
        }

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
