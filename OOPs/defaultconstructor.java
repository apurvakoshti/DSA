class Car{
    String name;
    int year;

    Car(){

    }

    void displayInfo(){
        System.out.println("The name of car is: "+ name + " and the year it was developed is: "+ year);
    }
}
public class defaultconstructor {
    public static void main(String args[]){
        Car c= new Car();
        c.displayInfo();
    }

    
}
