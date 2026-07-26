/*Create a Student class with constructors:
- Student()
- Student(String name)
- Student(String name, int age)
- Student(String name, int age, String city)

Use constructor chaining so only the last constructor initializes all values.*/
package Oops.Clss_OBjects.constructor_chaining;

import java.util.Scanner;

public class Question_fifth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter Age");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Enter city: ");
        String city = input.nextLine();

        Student s = new Student(name,age,city);
    }
}
class Student{
    public Student(){
        this("unknown");
        System.out.println("Default constructor called");
    }
    public Student(String name){
        this(name,0);
        System.out.println("Default constructor called");
    }
    public Student(String name, int age){
        this(name,age,"Unkonwn");
        System.out.println("Second constructor");
    }
    public Student(String name, int age, String city){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("City: "+city);
    }
}
