import java.util.*;
public class reverseastringusingstack2 {
    public static String helper(String str){

        Stack<Character> s= new Stack<>();
        StringBuilder result= new StringBuilder();

        for(int i=0; i<str.length(); i++){
            s.push(str.charAt(i));
        }

        while(!s.isEmpty()){
            result.append(s.pop());
        }

        return result.toString();

    }

    public static String reverseString(String str){
        return helper(str);

    }

    public static void main(String args[]){
        String str="raj";

        System.out.println(reverseString(str));
    }
}
