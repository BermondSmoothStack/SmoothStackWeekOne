package apr.ss.assign.firstweek.consumerproducer;

public interface IConsumer {

    boolean consume(Integer item) throws InterruptedException;

}
