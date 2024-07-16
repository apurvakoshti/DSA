class Animal{
    String color;
    Animal(){
        System.out.println("constructor is called for animal");
    }
}
class Horse extends Animal{
    Horse(){
        super();
        super.color="Brown";
        System.out.println("constructor is called for horse");
    }
}
public class superkeyword {
    public static void main(String args[]){
        Horse h1= new Horse();
        System.out.println(h1.color);

    }
}
