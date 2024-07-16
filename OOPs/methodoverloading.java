class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}
public class methodoverloading {
    public static void main(String args[]){
        Calculator c= new Calculator();
        System.out.println(c.sum(3, 5));
        System.out.println(c.sum((float) 3.2, (float) 2.6));
        System.out.println(c.sum(1, 2, 3));

    }
}
