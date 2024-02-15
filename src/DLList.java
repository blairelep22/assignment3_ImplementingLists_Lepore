

public class DLList<B> {
    DLNode<B> head;

    //private DLNode head;

    public DLList() {
        head = null;
    }


    public void listAdd(B p) {
        DLNode<B> newNode = new DLNode<>(p);
        if (head == null) {
            head = newNode;
        } else {
            DLNode<B> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
            newNode.setFirst(current);

        }
    }
    public void listRemove(int pos) {
        if (head == null) {
            return;
        }
        DLNode current = head;
        int count = 0;
        while (current != null) {
            if (count == pos) {
                if (current.getFirst() != null) {
                    current.getFirst().setNext(current.getNext());
                } else {
                    head = current.getNext();
                }
                if (current.getNext() != null) {
                    current.getNext().setFirst(current.getFirst());
                }
                return;
            }
            current = current.getNext();
            count++;
}}
    public String toString() {
        StringBuilder result = new StringBuilder();
        DLNode<B> current = head;
        while (current != null) {
            result.append(current.getData().toString()).append("\n");
            current = current.getNext();
        }
        return result.toString();
}}