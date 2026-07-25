/*Create a class Employee with:
    - Default constructor
    - Parameterized constructor (int id, String name)
Let the default constructor call the parameterized constructor using:
this(101, "Ashish");
*/
package Oops.Clss_OBjects.constructor_chaining;

public class Question_sec {
    public static void main(String[] args) {
        employee emp = new employee();
    }
}
class employee{
    public employee(){
        this(101,"Ashish");
        System.out.println("Default constructor called");
    }
    public employee(int id, String name){
        System.out.println("id: "+id+"  "+"Name: "+name);
    }
}
