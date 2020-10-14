
/**
 *
 * @author zn
 */


public class Queue {
    private final LinkedList list;
    
    public Queue(long[] dataArray) {
        list = new LinkedList(dataArray);
    }
    
    public void displayQueue() {
        list.displayList();
    }
    
    public void insert(long value) {
        list.insertLast(value);
    }
    
    public long dequeue() {
        long temp = list.getFirst();
        list.deleteFirst();
        return temp;
    }
    
    public long peekFirst() {
        return list.getFirst();
    }
    
    public long peekLast() {
        return list.getLast();
    }
    
    public int getSize() {
        return list.getSize();
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
