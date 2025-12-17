 public class CustomList {
    
    private Node head;

    public CustomList() {
        this.head = null;
    }

    public CustomList(Node newHead) {
        this.head = newHead;
    }

    
    public void append(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

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

    public void Add(int index, Node newNode) throws indexOutOfBoundsException{
        if(index == 0){
            newNode.setNext(head);
            this.head = newNoad;
        }esle if(index > 0 && index <= size()){
            Node prev = get(index-1);
            newNode.setNext(prev.getNext());
            prev.setNext(newNode);
        }else
            throw new indexOutOfBoundsException("invalid position");
    }

    //metodoGet che ti ritorna il nodo che vuoi
    private Node getRec(Node cursor, int index) throws indexOutOfBoundsException{
        if(index < 0 || index >= size()){
            throw new indexOutOfBoundsException("invalid index");
        }
        if(index == 0)
            return head;

        return getRec (cursor.getNext(), index - 1)
    }

    public Node get (int index){
        return getRec(head, index);
    }

    // Lunghezza del nodo in modo ricorsivo
    public int size(){
        return sizeRE(head);\
    }

    private int sizeRE(Node cursor){
        if(cursor == null) return 0;

        return sizeRE(cursor.getNext()) +1;
    }
    
    // Lunghezza del nodo
    public int length(){
        Node cursor = head;
        int count = 0;
        while(cursor != null){
            count++;
            cursor = cursor.getNext();       
        }
        return count;
    }

    // Write the remove method that removes a node by its index
    public void remove(int index) throws indexOutOfBoundsException{
        if(index < 0 || index >= size()){
            throw new indexOutOfBoundsException("invalid index");
        }
        if(index == 0){
            head = head.getNext();
        }else{
            Node prev = get(index - 1);
            Node toRemove = prev.getNext();
            prev.setNext(toRemove.getNext());
        }
    }
}
