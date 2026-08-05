package object_oriented_programing;

/*2. Employee Constructor Overloading
Create an Employee class with constructors:
- Default constructor
- Constructor with name
- Constructor with name and salary

Create a display() method to print the employee details.*/

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Employee def = new Employee();
        Employee para = new Employee("Prince Kumar");
        Employee dPara = new Employee("Prince Kumar", 150000);

        dPara.display();

    }
}
class Employee{
    String name;
    double salary;

    Employee(){
        name="unknown";
        salary = 0.0;
    }
    Employee(String name){
        this.name = name;
        salary = 0.0;
    }
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("Employee name: "+name+" - "+" Salary have taken from Company: "+ salary);
    }
}
