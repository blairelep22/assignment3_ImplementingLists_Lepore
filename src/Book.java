public class Book {

    //attributes!

    private String title;
    private String author;
    private double price;

    //build

    public Book (String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;

    }

    //get()s

    public String getTitle() {
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    //Setter()s

    public void setTitle(String title){
        this.title =title;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }

    //method to rep the book as a full string
    public String toString() {
        return "Title: " + title + ", Author: " + author + " Price: $" + price;
    }

    public static void main (String[] args){
        Book book = new Book("Black Clover" , "Yuki Tabata", 20.49);
        System.out.println(book);
    }


}
