package apr.ss.assign.firstweek.dayfour.consumerproducer;

import apr.ss.assign.firstweek.generatenumber.GenerateNumber;

public class Producer implements IProducer<Integer> {

    private String name = "anonymous producer";

    public Producer() {
    }

    public Producer(String name) {
        this.name = name;
    }

    @Override
    public Integer produce() throws InterruptedException {
        Thread.sleep((new GenerateNumber(999)).randomNumber);
        System.out.println(name + " produced an item.");
        return (new GenerateNumber()).randomNumber;
    }

    @Override
    public boolean isProducer() {
        return true;
    }
}
