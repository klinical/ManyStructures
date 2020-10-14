
/**
 *
 * @author zn
 */
public final class LinkedList {
    private Link first;
    private Link last;
    
    // Constructor
    public LinkedList(long[] data) {
        first = null;
        last = null;
        for (int i=0;i<data.length;i++) {
            insertLast(data[i]);
        }
    }
    
    // Get Array (Return a primitive array by copy)
    public long[] getArray() {
        Link current = first;
        long[] array = new long[getSize()];
        for (int i=0; i<getSize();i++) {
            array[i] = current.data;
            current=current.next;
        }
        return array;
    }
    
    // Display the contents of the list
    public void displayList() {
        Link current = first;
        while (current != null) {
            System.out.println(current.toString());
            current = current.next;
        }
    }
    
    // Swap
    public void swap(int one, int two) {
        Link linkOne = search(one);
        Link linkTwo = search(two);
        long temp = linkOne.data;
        
        linkOne.data = linkTwo.data;
        linkTwo.data = temp;
    }
    
    // Find - Public method for external use to return data
    public long find(int index){
        return search(index).data;
    }
    
    // Search - Private method for internal use
    private Link search(int index) {
        if ((index-first.index)<(last.index-index)) {
            Link current = first;
            while (current.index != index) {
                current = current.next;
            }
            return current;
        } else {
            Link current = last;
            while (current.index != index) {
                current = current.previous;
            }
            return current;
        }
    }
    
    // Get First ( Might return null )
    public long getFirst() {
        return first.data;
    }
    
    // Get Last ( Might return null )
    public long getLast() {
        return last.data;
    }
    
    // Insert First
    public void insertFirst(long value) {
        // insert element at first position, increment id of each link by one
        Link newLink = new Link(1, value);
        
        if (!isEmpty()) {
            Link current = first;
            while (current != null) {
                current.index++;
                current=current.next;
            }
            
            first.previous = newLink;
            
        } else {
            last = newLink;
        }
        
        newLink.next = first;
        first = newLink;
        
    }
    
    // Delete first
    public void deleteFirst() {
        if (first.next==null) {
            last = null;
        } else {
            first.next.previous = null;
            
            // Decrement each index
            Link current = first;
            while (current!=null) {
                current.index--;
                current=current.next;
            }
        }
        first = first.next;
    }
    
    // Delete last
    public void deleteLast() {
        if (first.next == null) {
            first = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
    }
    
    // Insert Last
    public void insertLast(long value) {
        Link newLink = new Link(1, value);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            last.next.index = (last.index+1);
            newLink.previous = last;
        }
        last = newLink;
    }
    
    // Get Size
    public int getSize() {
        return last.index;
    }
    
    // Is Empty?
    public boolean isEmpty() {
        return first==null;
    }
    
    // Nullify
    public void nullify() {
        while (first!=null) {
            first.next.previous = null;
        }
    }
    
    // Zeroify
    public void zeroify() {
        Link current = first;
        while (current!=null) {
            current.data=0;
            current=current.next;
        }
    }
}
