
/**
 *
 * @author zn
 */
public class Link {
    public int index;
    public long data;
    public Link next;
    public Link previous;
    
    public Link(int index, long data) {
        this.index=index;
        this.data=data;
    }
    
    // Empty link
    public Link() {
        index=0;
        data=0; 
        next=null;
        previous=null;
    }
    
    @Override
    public String toString() {
        return ("["+index+"]"+" "+data);
    }
}
