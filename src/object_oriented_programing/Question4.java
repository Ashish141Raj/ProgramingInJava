package object_oriented_programing;
/*4. Book Constructor Chaining
Create a Book class with:
- title
- author
- price

Constructors:
- Default constructor
- Constructor with title
- Constructor with title and author
- Constructor with title, author and price

Use this() constructor chaining.
Display the final values.
*/
public class Question4 {
    public static void main(String[] args) {
        Book obj = new Book("The Art of Living");
        obj.display();

    }
}
class Book{
    String title;
    String author;
    float price;

//    Default Constructor
    Book(){
        this("unknown");
    }
//    Constructor with title of Book
    Book(String title){
        this(title,"Babatillu");
    }
// Constructor with title and author

    Book(String title,String author){
        this(title,author,150);
    }
//  Constructor with title, author and price
    Book(String title,String author,float price){
        this.title = title;
        this.author=author;
        this.price = price;
    }
    void display(){
        System.out.println("Book :"+title+" ,"+author+" -> "+price);
    }
}
