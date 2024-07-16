class Animal{
    void eats(){
        System.out.println("animal eats");
    }

    void sleeps(){
        System.out.println("animal sleeps");
    }
}

class Mammal extends Animal {
    void hasHair() {
        System.out.println("Mammal has hair");
    }

    void producesMilk() {
        System.out.println("Mammal produces milk");
    }
}
class Bird extends Animal {
    void hasFeathers() {
        System.out.println("Bird has feathers");
    }

    void laysEggs() {
        System.out.println("Bird lays eggs");
    }
}
class Bat extends Mammal {
    void fly() {
        System.out.println("Bat can fly");
    }
}

// Penguin class demonstrating multilevel inheritance
class Penguin extends Bird {
    void swim() {
        System.out.println("Penguin can swim");
    }
}
public class hybridinheritance {
    public static void main(String args[]){
        Mammal mammal = new Mammal();
        Bird bird = new Bird();
        Bat bat = new Bat();
        Penguin penguin = new Penguin();

        
        mammal.eats();     
        mammal.sleeps();   

        bird.eats();      
        bird.sleeps();     

       
        mammal.hasHair();     
        mammal.producesMilk(); 

        bird.hasFeathers(); 
        bird.laysEggs();    

        
        bat.fly();       
        penguin.swim(); 

    }
}
