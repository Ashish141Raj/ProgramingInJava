/*Method Overloading
*Create a class Area and overload the method calculateArea();
* -CalculateArea(int side)->Square
* -CalculateArea(int length, int breadth) -> Rectangle
* -CalculateArea(double radius) -> Circle
* call all overload methods
*/

package Oops.Clss_OBjects;

public class QuestionThird {
    public static void main(String[] args) {
        Area obj = new Area();
        obj.display();
    }
}
class Area{

//Square
    double CalculateArea(double side){return side*side;}
//Rectangle
    double CalculateArea(double length,double width){return length*width;}
//Circle
    double CalculateArea(int radius){return  (3.14*radius*radius);}

    void display(){
        System.out.println("Area of Square: "+CalculateArea(5.0));
        System.out.println("Area of Rectangle: "+CalculateArea(2,4));
        System.out.println("Area of Circle: "+CalculateArea(5));
    }
}
