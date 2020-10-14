
/**
 *
 * @author zn
 */
public class ManyStructuresDriver {
    public static void main(String[] args) {
        int size = 10;
        // New ManyStructures instance, size of 10
        ManyStructures mainStructure = new ManyStructures(size);
        
        // Assigning values to the main structure
        for (int i=0;i<size;i++) {
            mainStructure.setValue(i, (i*3));
        }
        
        // Get our queue, stack, and linked list
        // (internally, the getter actually creates a new object for these,
        // so that if the array is changed, a fresh queue/stack/list is created)
        Queue mainQueue = mainStructure.getQueue();
        Stack mainStack = mainStructure.getStack();
        LinkedList mainList = mainStructure.getLinkedList();
        
        /*
        Functionality demonstrations
        */
        
        // Main Structure //
        
        System.out.println("Main structure size: "+mainStructure.size());
        mainStructure.display(); // Uses #getValue() internally!
        
        System.out.println("Creating a copy and changing it's values");
        long[] copyStructure = mainStructure.getArray();
        ManyStructures secondaryStructure = new ManyStructures(copyStructure.length);
        for (int k=0;k<copyStructure.length;k++) {
            secondaryStructure.setValue(k, (k*8));
        }
        System.out.println("");
        System.out.println("Displaying copy structure contents");
        secondaryStructure.display();
        System.out.println("Displaying original structure contents");
        mainStructure.display();
        
        ///////////////////////////////////
        
        // Queue //
        queueDemo(mainQueue);
        
        // Stack //
        stackDemo(mainStack);
        
        // Linked List //
        linkedListDemo(mainList);
        
        // Demonstrating that the initial main structure has not changed //
        // This uses #getValue() internally!
        mainStructure.display();
        
    }
    
    private static void queueDemo(Queue mainQueue) {
        System.out.println("Demonstrating Queue functionality");
        
        System.out.println("Initial queue contents");
        mainQueue.displayQueue();
        System.out.println("");
        
        System.out.println("First item in queue: "+mainQueue.peekFirst());
        System.out.println("Last item in queue: "+mainQueue.peekLast());
        
        System.out.println("Inserting a new object [30] into the queue...");
        mainQueue.insert(30);
        System.out.println("New last item in queue:"+mainQueue.peekLast());
        
        System.out.println("Displaying queue");
        mainQueue.displayQueue();
        System.out.println("");
        
        System.out.println("Performing a #dequeue() twice");
        System.out.println("Dequeued: "+mainQueue.dequeue());
        System.out.println("Dequeued: "+mainQueue.dequeue());
        
        System.out.println("Displaying queue again...");
        mainQueue.displayQueue();
        System.out.println("");        
        
        System.out.println("Final queue size: "+mainQueue.getSize());
        System.out.println("");
    }
    
    private static void stackDemo(Stack mainStack) {
        System.out.println("Demonstrating Stack functionality");
        
        System.out.println("Initial stack contents");
        mainStack.displayStack();
        System.out.println("");
        
        System.out.println("Peeking the top of the stack: "+mainStack.peek());
        
        System.out.println("Pushing a new element [50]");
        mainStack.push(50);
        System.out.println("Peeking new element: "+mainStack.peek());
        
        System.out.println("Displaying contents of stack");
        mainStack.displayStack();
        
        System.out.println("");
        System.out.println("Popping 3 elements from stack");
        System.out.println("Popped: "+mainStack.pop());
        System.out.println("Popped: "+mainStack.pop());
        System.out.println("Popped: "+mainStack.pop());
        System.out.println("");
        
        System.out.println("Displaying contents of stack");
        mainStack.displayStack();
        System.out.println("");        
        
        System.out.println("Final stack size: "+mainStack.getSize());
        System.out.println("");
    }
    
    private static void linkedListDemo(LinkedList mainList) {
        System.out.println("Demonstrating LinkedList functionality");
        
        System.out.println("Initial LinkedList contents");
        mainList.displayList();
        System.out.println("");
        
        System.out.println("Inserting an element [75] at the front");
        mainList.insertFirst(75);
        
        System.out.println("Searching for element at index 5");
        System.out.println("Found: "+mainList.find(5));
        
        System.out.println("Inserting an element [75] at the end");
        mainList.insertLast(75);
        System.out.println("");
        
        System.out.println("Displaying list");
        mainList.displayList();
        System.out.println("");
        
        System.out.println("Swapping elements at index 2 and index 8");
        mainList.swap(2,8);
        
        System.out.println("Displaying list");
        mainList.displayList();
        System.out.println("");
        
        System.out.println("Deleting first and last elements");
        mainList.deleteFirst();
        mainList.deleteLast();
        
        System.out.println("Displaying list");
        mainList.displayList();
        System.out.println("");
        
        System.out.println("Zeroing out the list");
        mainList.zeroify();
        
        System.out.println("Final display of list");
        mainList.displayList();        
        
        System.out.println("Final list size: "+mainList.getSize());
        System.out.println("");
    }
}
