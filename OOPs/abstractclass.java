abstract class Animal{

    abstract void sound();

    public void sleep(){
        System.out.println("animal is sleeping");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("dog braks");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("cat meows");
    }
}
public class abstractclass {
    public static void main(String args[]){
        Animal myDog= new Dog();
        myDog.sleep();
        myDog.sound();

        Animal myCat= new Cat();
        myCat.sleep();
        myCat.sound();

    }
}
