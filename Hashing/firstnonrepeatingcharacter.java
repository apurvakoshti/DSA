import java.util.*;
public class firstnonrepeatingcharacter {

    public static int firstNonRepeating(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(map.get(ch)==1){
                return i;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        String str="geeksforgeeks";
        System.out.println(firstNonRepeating(str));
    }
    
}
