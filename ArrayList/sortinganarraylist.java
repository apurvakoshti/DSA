import java.util.ArrayList;
import java.util.Collections;

public class sortinganarraylist {
    public static void main(String args[]){
         ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(1);
        list.add(9);

        System.out.println(list);
        Collections.sort(list); // it will sort in ascending order
        System.out.println(list);

        //to sort in descending order, use comparator - it is basically a function
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}
