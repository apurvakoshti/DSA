abstract class Animal{
    String color;

    Animal(){
        System.out.println("animal constructor is called");
    }

    public void eats(){
        System.out.println("animal eats");
    }

    abstract void walk();

}

class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor is called");
    }

    void walk(){
        System.out.println("walks on four legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructor is called");
    }
}
public class abstractconstructor {
    public static void main(String args[]){
        Mustang h1= new Mustang();

    }
}
