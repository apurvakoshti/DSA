public class constructor {
        int number;

        void displayInfo(){
           System.out.println("Number: "+ this.number);
        }
    
    public static void main(String args[]){
        constructor p1= new constructor();
        p1.displayInfo();

    }
    
}
