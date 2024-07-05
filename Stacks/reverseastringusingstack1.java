import java.util.*;

public class reverseastringusingstack1 {
    
    // Function to push a character at the bottom of the stack
    public static void pushAtBottom(Stack<Character> s, char data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        char top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    
    // Function to reverse the string
    public static void reverseString(Stack<Character> s, String str) {
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }
    
    public static void main(String args[]) {
        Stack<Character> s = new Stack<>();
        String inputString = "apurva";
        
        reverseString(s, inputString);
    }
}
