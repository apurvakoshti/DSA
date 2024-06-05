import java.util.*;
public class iteration {
    public static void main(String args[]){
        HashMap<String, Integer> hm= new HashMap<>();

        hm.put("Tea", 15);
        hm.put("Samosa", 25);
        hm.put("Coffee", 30);

        System.out.println(hm);

        Set<String> i = hm.keySet();
            for(String keys: i){
                System.out.println("Key: "+ keys+ ","+ "Value: "+ hm.get(keys));

            }
        }
    }

