public class classandobject {
    public static class Pen{
        String color;
        int tip;


        void changeColor(String newColor){
            color=newColor;
        }

        void changeSize(int newTip){
            tip= newTip;
        }
    }


    public static void main(String args[]){
        Pen obj1 = new Pen();
        obj1.changeColor("black");
        System.out.println(obj1.color);
        obj1.changeSize(2);
        System.out.println(obj1.tip);

    }
}
