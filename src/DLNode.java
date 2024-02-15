public class DLNode<B> {

    B data;
    DLNode<B> first;
    DLNode<B> next;

    public DLNode() {
//empty
    }

    public DLNode (B data){
        this.data = data;
    }
    public DLNode(B data, DLNode first, DLNode next) {
        this.data = data;
        this.first = first;
        this.next = next;
    }

    public B getData() {
        return data;
    }

    public void setData(B data){

        this.data = data;
    }

    public DLNode getFirst() {
        return first;
    }

    public void setFirst(DLNode first) {
        this.first = first;
    }

    public DLNode getNext() {
        return next;
    }

    public void setNext(DLNode next) {
        this.next = next;
    }
}
