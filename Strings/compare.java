public class compare {
    public static void main(String args[]){
        String str1="abc";
        String str2="abc";
        String str3= new String("abc");
        System.out.println(str1.equals(str2));
        System.out.println(str1==str3);
    }
}
