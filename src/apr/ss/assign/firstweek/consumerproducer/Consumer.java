package apr.ss.assign.firstweek.consumerproducer;

import apr.ss.assign.firstweek.generatenumber.GenerateNumber;

import java.util.ArrayList;
import java.util.List;

public class Consumer implements IConsumer{
    private List<Integer> basket;

    public Consumer() {
    }

    public Consumer(List<Integer> basket) {
        this.basket = basket;
    }

    @Override
    public boolean consume(Integer item) throws InterruptedException {
        if (null == basket){
            basket = new ArrayList<>();
        }
        Thread.sleep((new GenerateNumber(999)).randomNumber);
        if (item > -1) {
            basket.add(item);
            return true;
        } else {
            System.out.println("Item out of stock.");
            return false;
        }
    }
}
