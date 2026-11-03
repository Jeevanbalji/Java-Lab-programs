class Book {

    int bookID;
    String title;
    String author;
    double price;
    static int count = 0;

    Book(int bookID, String title, String author, double price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;

        count++;
    }
    void display() {
        System.out.println("Book ID : " + bookID);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Price   : " + price);
    }

    void search(int id) {
        if (bookID == id) {
            System.out.println("Book found!");
            display();
        } else {
            System.out.println("Book not found!");
        }
    }

    void search(String title) {
        if (this.title.equalsIgnoreCase(title)) {
            System.out.println("Book found!");
            display();
        } else {
            System.out.println("Book not found!");
        }
    }

    Book costlierBook(Book b) {

        if (this.price > b.price) {
            return this;
        } else {
            return b;
        }
    }
}

public class MAIN {

    public static void main(String[] args) {
        Book b1 = new Book(001, "Java Programming", "James", 500);
        Book b2 = new Book(002, "Python Basics", "Guido", 450);
        Book b3 = new Book(003, "C Programming", "Dennis", 600);

        System.out.println("BOOK DETAILS");
        System.out.println("----------------");

        b1.display();
        b2.display();
        b3.display();
        System.out.println("Searching Book ID 102:");
        b2.search(002);

        System.out.println("Searching for Java Programming:");
        b1.search("Java Programming");

       
        Book costly = b1.costlierBook(b3);

        System.out.println("Costlier Book:");
        costly.display();

        System.out.println("Total books created: " + Book.count);
    }
}