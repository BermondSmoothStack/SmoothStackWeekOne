package apr.ss.assign.firstweek.dayfour.consumerproducer;

import apr.ss.assign.firstweek.generatenumber.GenerateNumber;

import java.util.ArrayList;
import java.util.List;

public class Consumer implements IConsumer<Integer> {
    private List<Integer> basket;
    private String name = "anonymous consumer";

    public Consumer() {
    }

    public Consumer(String name) {
        this.name = name;
    }

    public Consumer(List<Integer> basket) {
        this.basket = basket;
    }

    @Override
    public boolean consume(Integer item) throws InterruptedException {
        System.out.println(name + " tries to consume an item.");
        if (null == basket) {
            basket = new ArrayList<>();
        }
        Thread.sleep((new GenerateNumber(999)).randomNumber);
        if (null != item && item > -1) {
            basket.add(item);
            System.out.println(name + " successfully consumed " + item);
            return true;
        } else {
            System.out.println(name + " failed. Item out of stock.");
            return false;
        }
    }

    @Override
    public boolean isConsumer() {
        return true;
    }
}
