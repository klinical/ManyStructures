
/**
 *
 * @author zn
 */
public class Stack {
    private final LinkedList list;
    public Stack(long[] data) {
        list = new LinkedList(data);
    }
    
    public void displayStack() {
        list.displayList();
    }
    
    public void push(long value) {
        list.insertLast(value);
    }
    
    public long peek() {
        return list.getLast();
    }
    
    public long pop() {
        long temp = list.getLast();
        list.deleteLast();
        return temp;
    }
    
    public int getSize() {
        return list.getSize();
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
