package object_oriented_programing;
/*
5. Mobile Constructor Chaining
Create a Mobile class with:
- brand
- model
- price

Constructors:
- Default constructor
- Constructor with brand
- Constructor with brand and model
- Constructor with brand, model and price

Use this() constructor chaining.
Display the object details*/

public class Question5 {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.display();
    }
}
class Mobile{
    String brand;
    String Model;
    float price;
//Default Constructor
    Mobile(){
      this("SAMSUNG");
    }
//    Single parameterized Constructor
    Mobile(String brand){
        this(brand,"f15");
    }
//  Constructor with brand and model
    Mobile(String brand, String Model){
        this(brand,Model,170009.0f);
    }
//    - Constructor with brand, model and price
    Mobile(String brand,String Model,float price){
        this.Model=Model;
        this.brand=brand;
        this.price= price;
    }
    void display(){
        System.out.println("Model: "+Model);
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
    }
}
