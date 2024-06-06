import java.util.HashSet;

public class hashset {
     public static void main(String args[]){
        HashSet<Integer> set= new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(null);
        set.add(1);
        set.add(2);

        System.out.println(set.remove(1));
        System.out.println(set.contains(2));
        System.out.println(set);
        set.clear();
        System.out.println(set.isEmpty());

    }
    
}
