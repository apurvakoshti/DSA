// public class Main{
//     public static class MyClass{
//         int x;
//         String y;

//         public MyClass( int x, String y){
//            this.x=x;
//            this.y=y;
//         }

//         public void Display(){
//             System.out.println("X: "+ x);
//             System.out.println("Y:" +y);
//            }
    
//     }

//     public static void main(String args[]){
//         MyClass obj1= new MyClass(10, "Hello");
//         System.out.println(obj1.x);
//         System.out.println(obj1.y);

//         obj1.Display();


//     }

// }

public class main{
    public static void main(String args[]){
        MyClass obj1= new MyClass(5,"Kawai");
        System.out.println(obj1.x);
        System.out.println(obj1.y);

        obj1.Display();
    }
}

class MyClass{
    int x;
    String y;

    public MyClass(int x, String y){
        this.x=x;
        this.y=y;
    }

    public void Display(){
        System.out.println("X:" + x);
        System.out.println("Y:"+ y);
    }
}