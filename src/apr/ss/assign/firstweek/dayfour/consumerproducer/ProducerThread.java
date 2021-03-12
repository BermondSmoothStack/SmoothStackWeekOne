package apr.ss.assign.firstweek.dayfour.consumerproducer;

import java.util.Iterator;
import java.util.Queue;

public class ProducerThread extends Thread {

    private final Queue<Producer> producerQueue;

    public ProducerThread(Queue<Producer> producerQueue) {
        this.producerQueue = producerQueue;
    }

    @Override
    public void run() {
        Iterator<Producer> itr = producerQueue.iterator();

        while(itr.hasNext()) {
            Producer producer = itr.next();
            boolean success = producerTransactionHandler(producer);
            while (!success) {
                success = producerTransactionHandler(producer);
            }
        }
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
}
