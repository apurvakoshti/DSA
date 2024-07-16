class Animal{
    String color;

    void eats(){
        System.out.println("animal eats");
    }

    void breathe(){
        System.out.println("animal breathe");
    }
}

class Mammal extends Animal{
    int legs;
}

class Cat extends Mammal{
    String breed;

    void color(){
        System.out.println("orange in color");
    }
}
public class multilevelinheritance {
    public static void main(String args[]){
        Mammal human = new Mammal();
        human.eats();
        human.breathe();

       Cat bali= new Cat();
       bali.eats();
       bali.breathe();
       bali.color();

    }
}
