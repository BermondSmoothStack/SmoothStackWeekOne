package apr.ss.assign.firstweek.dayfour.consumerproducer;

public interface IConsumer {

    boolean consume(Integer item) throws InterruptedException;

}
