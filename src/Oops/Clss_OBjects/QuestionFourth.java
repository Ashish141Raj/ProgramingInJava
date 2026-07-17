/*Create an employee class with:
* -id
* -name
* -salary
* use:
*  -Default constructor
*  -Parameterized Constructor
* Also overload a method bonus():
* -bonus()
* -bonus(double percentage)
* Display employee details and calculated bonus.*/

package Oops.Clss_OBjects;

public class QuestionFourth {
    public static void main(String[] args) {
        Employee obj1 = new Employee();
        obj1.display();
        System.out.println("Default Bonus: "+obj1.bonus());

        System.out.println();

        Employee obj2 = new Employee(101,"Ashish",90000);
        obj2.display();
        System.out.println(obj2.name+" "+"Bonus: "+obj2.bonus()+",With Bonus Total Salary-> "+(obj2.salary+obj2.bonus()));

    }
}
class Employee{
    int id;
    String name;
    double salary;

//  Default Constructor
    public Employee(){
        id = 0;
        name = "Unknown Employee";
        salary = 0;
    }
//Parameterized constructor

    public Employee(int id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
//bonus methods
    double bonus(){
        return salary * 0.10;
    }
    double bonus(double percentage){
        return salary * percentage/100;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("id: "+id);
        System.out.println("salary: "+salary);
    }
}
