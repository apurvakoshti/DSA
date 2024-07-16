class Animal{
    String color;

    void eats(){
        System.out.println("animal eats");
    }

    void breathe(){
        System.out.println("animal breathe");
    }
}

class Fish extends Animal{

    void swims(){
        System.out.println("fish swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("birds fly in the sky");
    }
}

class Mammal extends Animal{
    void walks(){
        System.out.println("mammals walks");
    }
}
public class hierarchicalinheritance {
    public static void main(String args[]){
        Mammal human= new Mammal();
        human.eats();
        human.breathe();
        human.walks();

        Bird peacock= new Bird();
        peacock.eats();
        peacock.breathe();
        peacock.fly();

        Fish jellyfish= new Fish();
        jellyfish.eats();
        jellyfish.breathe();
        jellyfish.swims();




    }
}
