import java.util.*;
public class characterswithfrequency {
    public static void characterFrequency(String str){

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+ ":" + entry.getValue());
        }
    }
    public static void main(String args[]){
        String str= "example string";
        characterFrequency(str);


    }
}
