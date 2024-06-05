import java.util.HashMap;
public class creationandoperationsonhashmap{
    public static void main(String args[]){
        //to create a hashmap
        HashMap<String, Integer> hm= new HashMap<>();

        //to insert into hashmap- put(key, value)
        hm.put("India", 120);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Bhutan", 1);

        System.out.println(hm);

        //to get value of key - Get(key)
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Indonesia"));

        //to check whether a particular key exists or not in hashmap- containsKey(key)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        // to remove the (key, value) pair and return the value - remove(key)
        System.out.println(hm.remove("China"));

        //to get size of hashmap - size
        System.out.println(hm.size());

        //checks whether hashmap is empty or not
        System.out.println(hm.isEmpty());

        //clear the whole hashmap- clear
        hm.clear();


    }
}