package apr.ss.assign.firstweek.dayfour.consumerproducer;

public interface IProducer<T> {

    T produce() throws InterruptedException;
    boolean isProducer();

}
