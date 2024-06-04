import java.util.*;
public class minimuminarraylist {

    public static int smallest(ArrayList<Integer> list){

        int smallest= Integer.MAX_VALUE;
        for(int i=0; i< list.size(); i++){
            smallest= Math.min( smallest, list.get(i));
        }

        return smallest;

    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(0);
        list.add(-1);
        list.add(8);
        list.add(2);
        System.out.println(list);
        System.out.println(smallest(list));

    }
    
}
