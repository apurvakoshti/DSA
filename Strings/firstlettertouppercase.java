public class firstlettertouppercase {

    public static String upperCase(String str){

      StringBuilder sb= new StringBuilder("");
      char ch= Character.toUpperCase(str.charAt(0));
      sb.append(ch);

      for(int i=1; i<str.length(); i++){
        if(str.charAt(i)==' ' &&  i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            sb.append(str.charAt(i));
        }
      }

      return sb.toString();
        
      
    }
    public static void main(String args[]){
        String str= "i am apurva";
        System.out.println(upperCase(str));
        String str2= "hello WORLD";
        System.out.println(upperCase(str2));
    }
}
