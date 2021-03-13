package apr.ss.assign.firstweek.dayfour.consumerproducer;

public interface IMarket<T> {

    boolean buy(T item);
    T sell();

}
