package apr.ss.assign.firstweek.dayfour.consumerproducer;

import java.util.Queue;

public class ConsumerTransaction {
    public ConsumerTransaction(Queue<Consumer> consumerQueue) {
        new ConsumerThread(consumerQueue).start();
    }
}
