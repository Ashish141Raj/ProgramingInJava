/*Create a class Student with:
- Default constructor
- Parameterized constructor (String name)

The default constructor should call the parameterized constructor using:
this("Ashish");

Expected Output:
Student Name: Ashish
Default Constructor Called*/
package Oops.Clss_OBjects.constructor_chaining;
class stu{
    stu(){
        this("Ashish");
        System.out.println("Default constructor");
    }
    stu(String name){
        System.out.println("Name: "+name);
    }
}
public class Question_sixth {
    public static void main(String[] args) {
        stu s = new stu();
    }
}
