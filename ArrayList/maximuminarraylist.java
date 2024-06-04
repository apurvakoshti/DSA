import java.util.*;
public class maximuminarraylist {
   public static int largest(ArrayList<Integer> list){
        int largest= Integer.MIN_VALUE;
        for(int i=0; i<list.size();i++){
            if( largest < list.get(i)){
                largest= list.get(i);
            }
        }

        return largest;
    }
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(100);
        list.add(5);
        list.add(0);

        System.out.println(list);

        System.out.println(largest(list));
    
    }
}
