package apr.ss.assign.firstweek.dayfour.consumerproducer;

public interface IConsumer<T> {

    boolean consume(T item) throws InterruptedException;
    boolean isConsumer();

}
