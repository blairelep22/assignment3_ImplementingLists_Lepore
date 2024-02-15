public class SLList<B> {
    SLNode<B> head;

    public SLList() {
        this.head = null;
    }

    public SLList(SLNode node) {
        this.head = node;
    }

    public void listAdd(B p) {
        SLNode<B> newNode = new SLNode<>(p);
        if (head == null) {
            head = newNode;
        } else {
            SLNode<B> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to remove a book from the SLList at the given position
    public void listRemove(int pos) {

        if(pos < 0 || (pos ==0 && head ==null)){
            throw new IndexOutOfBoundsException("Invalid");
        }


        if (pos == 0) {
            head = head.next;
            //return;

        } else {

            SLNode<B> prev = null;
            SLNode<B> current = head;
            int count = 0;
            while (current != null && count != pos) {
                prev = current;
                current = current.next;
                count++;
            }
            if (current != null) {
                prev.next = current.next;
            }
            if (current == null){
                throw new IndexOutOfBoundsException("Invalid");
            }
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        SLNode<B> current = head;
        while (current != null) {
            result.append(current.getData().toString()).append("\n");
            current = current.getNext();
        }
        return result.toString();
    }
}

