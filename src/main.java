import java.util.ArrayList;

public class main {
    public static void main (String[] args) {
        SLList<Book> SLlist = new SLList<>();
        //ArrayList<Book> Alist = new ArrayList<>();

        Book book1 = new Book("Black Clover" , "Yuki Tabata", 20.4);
        Book book2 = new Book("The Giving Tree", "Shel Silverstein", 15.00);
        Book book3 = new Book ("The Cat in the Hat", "Dr. Seus", 10.00);


        /*Alist.add(book1);
        Alist.add(book2);
        System.out.println("Original AList:");
        System.out.println(Alist.toString());
        Alist.remove(1);
        System.out.println("AList after change:");
        System.out.println(Alist.toString());*/


        SLlist.listAdd(book1);
        SLlist.listAdd(book2);
        SLlist.listAdd(book3);

        System.out.println("Original List: ");
        System.out.println(SLlist.toString());

        SLlist.listRemove(1);

        System.out.println("New List After Removing Book 2: ");
        System.out.println(SLlist.toString());

    }
}
