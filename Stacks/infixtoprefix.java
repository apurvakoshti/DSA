import java.util.*;
public class infixtoprefix {
    public static int priority(char c){
        if(c=='^') return 3;
        else if(c=='*' || c=='/') return 2;
        else if(c=='+' || c=='-') return 1;
        else return -1; 
    }

    public static String reverse(String exp){
        String reversed="";
        for(int i=exp.length()-1; i>=0; i--){
            char c=exp.charAt(i);
            if(c=='('){
                reversed +=')';
            }
            else if(c==')'){
                reversed +='(';
            }
            else {
                reversed += c;
            }
        }
        return reversed;
    }

    public static String infixToPostifx(String exp){
        Stack<Character> st= new Stack<>();
        String ans="";
        for(int i=0; i<exp.length(); i++){
            char c=exp.charAt(i);

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
            else {
                if(c=='^'){
                    while(!st.isEmpty() && priority(c)<= priority(st.peek())){
                        ans+= st.pop();
                    }
                    st.push(c);

                }
                else{
                    while(!st.isEmpty() && priority(c)< priority(st.peek())){
                        ans+= st.pop();
                    }
                    st.push(c);

                }
                
            }
        }

        while(!st.isEmpty()){
            ans += st.pop();
        }
        return ans;
    }

    public static String infixToPrefix(String exp){
        String reversedInfix=reverse(exp);
        String postfix= infixToPostifx(reversedInfix);
        String prefix= reverse(postfix);

        return prefix;
    }
    public static void main(String args[]){
        String exp="(A+B)*C-D+F";
        System.out.println(infixToPrefix(exp));
    }
}
