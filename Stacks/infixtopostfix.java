import java.util.*;
public class infixtopostfix {

    public static int priority(char c){
        if(c=='^') return 3;
        else if(c=='*' || c=='/') return 2;
        else if(c=='+' || c=='-') return 1;
        else return -1;
    }

    public static String infixToPostfix(String exp){
        Stack<Character> st= new Stack<>();
        String ans="";

        for(int i=0; i<exp.length(); i++){
            char c= exp.charAt(i);

            if((c>='A' && c<='Z') || (c>='a' && c<='z') || (c>='0' && c<='9')){
                ans +=c;
            }
            else if(c=='('){
                st.push(c);
            }
            else if(c==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans += st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && priority(c) <= priority(st.peek())){
                    ans += st.pop();
                }
                st.push(c);
            }
        }

        while(!st.isEmpty()){
            ans+= st.pop();
        }

        return ans;

    }
    public static void main(String args[]){
        String exp="a+b*(c^d-e)";
        System.out.println(infixToPostfix(exp));

    }
    
}
