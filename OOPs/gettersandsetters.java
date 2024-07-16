class Pen{
    private String color;
    private int tip;

    public void setColor(String newColor){
        color=newColor;
    }

    public void setTip(int newTip){
        tip=newTip;
    }

    public String getColor(){
        return color;
    }

    public int getTip(){
        return tip;
    }
}
public class gettersandsetters {
    public static void main(String args[]){
        Pen p1= new Pen();
        p1.setColor("red");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
    
}
