package object_oriented_programing;
/*8. University Management (Mixed Level)
Create a UniversityStudent class with:
- name
- rollNo
- department
- semester

Constructors:
- Default constructor
- Constructor with name
- Constructor with name and rollNo
- Constructor with name, rollNo and department
- Constructor with name, rollNo, department and semester

Use this() constructor chaining.
Create three student objects using different constructors and display their details.
*/
class UniversityStudent{
    String name;
    int rollNo;
    String department;
    String semester;

    UniversityStudent(){
        this("Ashish Raj");
    }
    UniversityStudent(String name){
        this(name,230741);

    }
    UniversityStudent(String name,int rollNo){
        this(name,rollNo,"BCA");
    }
    UniversityStudent(String name,int rollNo, String department){
        this(name,rollNo,department,"(vi)-th");
    }
    UniversityStudent(String name, int rollNo, String department, String semester){
        this.name=name;
        this.rollNo = rollNo;
        this.department = department;
        this.semester = semester;

    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll-Number: "+rollNo);
        System.out.println("Department: "+department);
        System.out.println("Semester: "+semester);
        System.out.println("**************************************************************************************");
    }
}
public class Question8 {
    public static void main(String[] args) {
        UniversityStudent obj1 = new UniversityStudent();
        obj1.display();
        UniversityStudent obj2 = new UniversityStudent("Navya Verma",230737);
        obj2.display();
        UniversityStudent obj3 = new UniversityStudent("Verma Raj",23000,"BBB","*");
        obj3.display();

    }
}
