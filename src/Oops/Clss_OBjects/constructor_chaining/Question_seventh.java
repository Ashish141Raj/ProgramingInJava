/*Create a class Employee with:
- Employee()
- Employee(int id)
- Employee(int id, String name)

Chain all constructors using this().

Expected Output:
Employee ID: 101
Employee Name: Rahul
One Parameter Constructor
Default Constructor*/
package Oops.Clss_OBjects.constructor_chaining;
class Emp{
    Emp(){
        this(101);
        System.out.println("Default Constructor");
    }
    Emp(int id){
        this(101,"Ashish");
        System.out.println("One parameter constructor called");
    }
    Emp(int id,String name){
        System.out.println("id: "+id);
        System.out.println("String: "+name);
    }
}
public class Question_seventh {
    public static void main(String[] args) {
        Emp emp = new Emp();
    }
}
