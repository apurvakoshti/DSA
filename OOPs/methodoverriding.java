class Vehicle{
    void move(){
        System.out.println("vehicle moves");
    }
}

class Car extends Vehicle{
    @Override
    void move(){
        System.out.println("car is moving on road");

    }
}
public class methodoverriding {
    public static void main(String args[]){
        Car supra= new Car();
        supra.move();

        Vehicle bike= new Vehicle();
        bike.move();
        
        Vehicle cycle= new Car();
        cycle.move();

    }
}
