public class SLNode<B> {

    B data;
    SLNode<B> next;


    //constructor empty
    public SLNode(){
    }

    public SLNode(B data) {
        this.data = data;
    }

    public SLNode (SLNode next){
        this.next = next;
    }
//**
    public SLNode (B data, SLNode next){
        this.data=data;
        this.next = next;
    }

    public B getData(){
        return data;
    }
    public void setData(B data){
        this.data = data;
    }

    public SLNode getNext(){
        return next;
    }

    public void setNext(SLNode next){
        this.next = next;
    }


}

