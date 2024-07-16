interface Animal{
    void makeSound();
    void eat();

}

class Dog implements Animal{
    @Override
    public void makeSound(){
        System.out.println("dogs barks");
    }

    public void eat(){
        System.out.println("dog eat bones");
    }
}

class Cat implements Animal{
    @Override
    public void makeSound(){
        System.out.println("cat meows");

    }

    public void eat(){
        System.out.println("cat eat fish");
    }
}
public class interfaces1 {
    public static void main(String args[]){
        Dog mayra= new Dog();
        mayra.makeSound();
        mayra.eat();

        Cat bali= new Cat();
        bali.makeSound();
        bali.eat();

    }
}
