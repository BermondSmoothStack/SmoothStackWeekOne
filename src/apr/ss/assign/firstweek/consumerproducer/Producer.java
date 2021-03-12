package apr.ss.assign.firstweek.consumerproducer;

import apr.ss.assign.firstweek.generatenumber.GenerateNumber;

public class Producer implements IProducer {
    @Override
    public Integer produce() throws InterruptedException{
        Thread.sleep((new GenerateNumber(999)).randomNumber);
        return (new GenerateNumber()).randomNumber;
    }
}
