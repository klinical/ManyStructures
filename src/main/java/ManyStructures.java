
/**
 *
 * @author zn
 */

public class ManyStructures {
    private long[] dataArray;
    
    public ManyStructures(int length) {
        this.dataArray = new long[length];
    }
    
    public int size() {
        return dataArray.length;
    }
    
    public void display() {
        for (int j=0;j<dataArray.length;j++) {
            System.out.print("["+(j+1)+"] "+getValue(j)+"\n");
        }
        System.out.println("");        
    }
    
    public long[] getArray() {
        long[] newArray = new long[dataArray.length];
        for (int i=0;i<dataArray.length;i++) {
            newArray[i] = dataArray[i];
        }
        return newArray;
    }
    
    public void setArray(long[] newArray) {
        dataArray = newArray;
    }
    
    public long getValue(int index) {
        if (index > dataArray.length || index < 0) {
            System.out.println("Index supplied for #getValue() out of bounds.");
            return -1;
        } else {
            return dataArray[index];
        }
    }
    
    public void setValue(int index, long value) {
        if (index > dataArray.length || index < 0) {
            System.out.println("Index supplied for #getValue() out of bounds.");
        } else {
            dataArray[index] = value;
        }
    }
    
    public Queue getQueue() {
        Queue queue = new Queue(dataArray);
        return queue;
    }
    
    public Stack getStack() {
        Stack stack = new Stack(dataArray);
        return stack;
    }
    
    public LinkedList getLinkedList() {
        LinkedList list = new LinkedList(dataArray);
        return list;
    }
}