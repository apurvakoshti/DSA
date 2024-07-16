class Car{
    String name;
    int year;

    //parameterised constructor
    public Car(String Name, int Year){
        name= Name;
        year=Year;
    }

    //copy constructor
    public Car(Car anotherCar){
        name= anotherCar.name;
        year= anotherCar.year;
    }

    public void displayInfo(){
        System.out.println("Name: "+ name + "Year: "+ year);
    }
}
public class copyconstructor {
    public static void main(String args[]){

    
    Car c1= new Car("BMW", 2000);
    Car c2= new Car(c1);

    c1.displayInfo();
    c2.displayInfo();
    }
    
}
