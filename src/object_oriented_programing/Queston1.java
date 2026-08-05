package object_oriented_programing;
/*1. Student Constructor (Easy)
Create a Student class with:
        - Instance variables: name, rollNo
        - Create a parameterized constructor.
        - Create two student objects and display their details.
------------------------------------------------------------*/

public class Queston1 {
    public static void main(String[] args) {
        Student obj = new Student("Prince Kumar",101);
        Student obj2 = new Student("Pragati kumari", 102);

        obj.display();
        obj2.display();
    }
}

class Student{
    String name;
    int rollNo;

    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    void display(){
        System.out.println("Name :"+name+" ->  "+"Roll: "+rollNo);
    }
}
