class Car{
    String name;
    int year;

    public Car(String nameOfCar, int yearOfMade ){
        name= nameOfCar;
        year= yearOfMade;
    }

    public void displayInfo(){
        System.out.println("The name of car is: "+ name + " and the year it was developed is: "+ year); 
    }
}
public class parameterisedconstructor {
    public static void main(String args[]){
        Car c= new Car("BMW", 1990);
        c.displayInfo();
    }
   
    
    
}
