class Animal{
    String color;

    void eat(){
        System.out.println("animal eats");
    }

    void breathe(){
        System.out.println("animal breaths also");
    }
}

class Fish extends Animal{
    int fins;

    void swims(){
        System.out.println("fish swims");
    }
}
public class singleinheritance {
    public static void main(String args[]){
        Animal dog= new Animal();
        dog.eat();
        dog.breathe();
        
        //dog.swims(); will give error

        Fish goldenfish= new Fish();
        goldenfish.eat();
        goldenfish.breathe();
        goldenfish.swims();

    }
    
    
}
