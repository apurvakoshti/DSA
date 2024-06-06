import java.util.HashMap;
public class validanagram {

    public static boolean isValid(String s, String t){

        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character, Integer> map= new HashMap<>();

        //iteration on s string
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        //iteration on t string
        for(int i=0; i<t.length(); i++){
            char ch=t.charAt(i);
            if(!map.containsKey(ch)){
                return false;
            }else{
                map.put(ch, map.get(ch)-1);
                map.remove(ch);
            }
        }

        return map.isEmpty();

    }
    public static void main(String args[]){
        String s="heart";
        String t="earth";
        System.out.println(isValid(s, t));
    }
}
