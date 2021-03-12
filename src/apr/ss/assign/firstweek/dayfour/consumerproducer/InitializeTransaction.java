package apr.ss.assign.firstweek.dayfour.consumerproducer;

import java.util.LinkedList;
import java.util.Queue;

public class InitializeTransaction {

    public InitializeTransaction() {

        Queue<Consumer> consumerQueue = new LinkedList<>();
        consumerQueue.add(new Consumer());
        consumerQueue.add(new Consumer());
        consumerQueue.add(new Consumer());
        new ConsumerTransaction(consumerQueue);

        Queue<Producer> producerQueue = new LinkedList<>();
        producerQueue.add(new Producer());
        producerQueue.add(new Producer());
        producerQueue.add(new Producer());
        new ProducerTransaction(producerQueue);

    }
}
