/*Create a class Book with:
- Book()
- Book(String title)
- Book(String title, double price)

Chain all constructors using this().

Expected Output:
Default Constructor
Title: Java
Price: 499
*/
package Oops.Clss_OBjects.constructor_chaining;

public class Question_third {
    public static void main(String[] args) {
        Book b = new Book("java",499);
    }
}
class Book{
    public Book(){
        System.out.println("Default constructor called");
    }
    public  Book(String title){
        this();
        System.out.println("Title: "+title);
    }
    public Book(String title, double price){
        this(title);
        System.out.println("price: "+price);

    }
}
