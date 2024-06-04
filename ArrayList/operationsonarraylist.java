import java.util.*;
public class operationsonarraylist {
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();

        //add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        //get element O(1)
        int ele= list.get(3);
        System.out.println(ele);

        //remove element O(n)
        list.remove(4);
        System.out.println(list);

        //set element O(n)
        list.set(4, 5);
        System.out.println(list);

        //contains element O(n)
        System.out.println(list.contains(9));



    }
}
