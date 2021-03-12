package apr.ss.assign.firstweek.dayfour.consumerproducer;

import java.util.Stack;

public class Market implements IMarket {

    private static volatile Market instance;
    private final Warehouse warehouse;


    private Market() {
        warehouse = new Warehouse(new Stack<>());
    }

    public static Market getInstance(){
        if (null == instance) {
            synchronized (Market.class) {
                if ( null == instance)
                    instance = new Market();
            }
        }

        return instance;
    }

    @Override
    public boolean buy(Integer item) {
        return warehouse.addToShelf(item);
    }

    @Override
    public Integer sell() {
        return warehouse.removeFromShelf();
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }
}
