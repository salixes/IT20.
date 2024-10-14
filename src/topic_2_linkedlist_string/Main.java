package topic_2_linkedlist_string;

public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();

        // Adding elements to the list
        list.add("Before it sinks in");
        list.add("Sarah G-Forevers not enough");
        list.add("Cup of Joe-morena girl");
        list.add("Jroa-Treat you better");
        System.out.println("Current Linked List:");
        System.out.println("------------------------------");
        list.printList();
        
        //Delete
        list.deleteByValue("The Juans-Hindi tayu pwede");
        System.out.println();
        System.out.println("Deleting |The Juans-Hindi tayu pwede| from the list...");
        System.out.println();
        System.out.println("Current Linked List:");
        System.out.println("------------------------------");
        list.printList();
        
        //Move/Swap Pointer
        System.out.println();
        System.out.println("Moving/Swapping node from index 1 to index 0");
        System.out.println();
        System.out.println("Current Linked List:");
        System.out.println("------------------------------");
        list.moveNodePointer(0, 1);
        list.printList();
	}

}