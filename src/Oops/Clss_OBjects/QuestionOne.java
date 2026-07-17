/*Create a Class Student with:
* -name
* -roll no
* Create a method display() to print student details.
* Create two objects and display their information.*/
package Oops.Clss_OBjects;

public class QuestionOne {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ashish";
        s1.roll = 21;
        s1.display();
    }
}
class Student{
    String name;
    int roll;

    void display(){
        System.out.println("Name: "+name+" -> "+"Roll: "+roll);
    }
}
