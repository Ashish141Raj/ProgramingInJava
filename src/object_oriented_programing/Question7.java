package object_oriented_programing;
/*7. Car Showroom (Constructor Chaining + Overloading)
Create a Car class with:
- company
- model
- price
- fuelType

Constructors:
- Default constructor
- Constructor with company
- Constructor with company and model
- Constructor with company, model and price
- Constructor with company, model, price and fuelType

Use this() constructor chaining.
Display all details.*/
class Car{
    String company;
    String model;
    float price;
    String fuelType;

    Car(){
        this("MAHINDRA");
    }
    Car(String company){
        this(company,"Scorpio-N");
    }
    Car(String company,String model){
        this(company,model,1750005f);
    }
    Car(String company,String model,float price){
        this(company,model,price,"E-20");
    }
    Car(String company, String model, float price, String fuelType){
        this.company = company;
        this.model = model;
        this.price=price;
        this.fuelType = fuelType;
    }
    void display(){
        System.out.println("Company: "+company+" "+"Model: "+model+" "+"price: "+price+" "+" fuelType: "+fuelType);
    }
}
public class Question7 {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.display();
    }
}

