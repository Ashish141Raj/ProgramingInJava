package object_oriented_programing;
/*3. Rectangle Area
Create a Rectangle class.

Constructors:
- No-argument constructor (length = 1, breadth = 1)
- Parameterized constructor

Create a method to calculate and print the area.

------------------------------------------------------------*/
public class Question3 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.calculateArea();
        Rectangle obj1 = new Rectangle(2,8);
        obj1.calculateArea();


    }
}
class Rectangle{
    float length,breadth;

    Rectangle(){
        length = 1;
        breadth = 1;
    }
    Rectangle(float length,float breadth){
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea(){
        float Area = length * breadth;
           System.out.println("Area of Rectangle: "+Area);
    }

}
