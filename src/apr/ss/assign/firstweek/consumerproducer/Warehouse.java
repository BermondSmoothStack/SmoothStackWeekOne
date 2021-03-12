package apr.ss.assign.firstweek.consumerproducer;

import java.util.List;
import java.util.Stack;

public class Warehouse {
    Stack<Integer> shelf;
    Integer limit = 10;

    public Warehouse(Stack<Integer> shelf) {
        this.shelf = shelf;
    }

    public List<Integer> getShelf() {
        return shelf;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public void setShelf(Stack<Integer> shelf) {
        this.shelf = shelf;
    }

    public boolean addToShelf(Integer item) {
        if (!isFull()) {
            this.shelf.push(item);
            return true;
        } else {
            System.out.println("Warehouse full.");
            return false;
        }
    }

    public Integer removeFromShelf() {
        if (!shelf.isEmpty())
            return shelf.pop();
        return -1;
    }

    public boolean isFull() {
        return shelf.size() >= limit;
    }

    public boolean isEmpty() {
        return shelf.isEmpty();
    }
}