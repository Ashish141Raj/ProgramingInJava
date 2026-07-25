/*Create a class Student with:
        - Default constructor
        - Parameterized constructor (String name, int age)
Use this() so the parameterized constructor calls the default constructor.
 **/
package Oops.Clss_OBjects.constructor_chaining;

public class Question_one {
    public static void main(String[] args) {
      student s = new student("Ashish",22);
    }
}
class student{
    public student(){
        System.out.println("Default constructor called");
    }
    public student(String name,int age){
        this();
        System.out.print("Name: "+name+" ,");
        System.out.println("Age: "+age);
    }
}
