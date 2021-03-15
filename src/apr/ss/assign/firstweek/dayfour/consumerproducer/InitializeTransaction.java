package apr.ss.assign.firstweek.dayfour.consumerproducer;

import java.util.LinkedList;
import java.util.Queue;

public class InitializeTransaction {

    public InitializeTransaction() {
        Queue<Producer> producerQueue = new LinkedList<>();
        producerQueue.add(new Producer("U"));
        producerQueue.add(new Producer("V"));
        producerQueue.add(new Producer("W"));
        producerQueue.add(new Producer("X"));
        producerQueue.add(new Producer("Y"));
        producerQueue.add(new Producer("Z"));
        new ProducerTransaction(producerQueue);

        Queue<Consumer> consumerQueue = new LinkedList<>();
        consumerQueue.add(new Consumer("A"));
        consumerQueue.add(new Consumer("B"));
        consumerQueue.add(new Consumer("C"));
        new ConsumerTransaction(consumerQueue);


    }
}
