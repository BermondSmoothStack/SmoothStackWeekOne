package apr.ss.assign.firstweek.consumerproducer;

import java.util.Queue;

public class ProducerTransaction {
    public ProducerTransaction(Queue<Producer> producerQueue) {
        new ProducerThread(producerQueue).start();
    }
}
