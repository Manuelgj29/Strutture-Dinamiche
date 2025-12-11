public class CustomList {
    
    private Node head;

    public CustomList() {
        this.head = null;
    }

    public CustomList(Node newHead) {
        this.head = newHead;
    }

    /**
     * Adds a new node at the end of the list
     * @param newNode new node to be added
     */
    public void append(Node newNode) {
        if (head == null) {
            // If the list is empty, the new node becomes the head
            head = newNode;
        } else {
            // Otherwise, traverse to the last node and append
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    /**
     * Outputs every list item on the console
     */
    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.toString());
            if (current.getNext() != null) {
                System.out.print(" -> ");
            }
            current = current.getNext();
        }
        System.out.println();
    }
}
