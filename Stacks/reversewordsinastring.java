import java.util.ArrayList;

public class reversewordsinastring {
    public static String reverseString(String str) 
	{
		str= str.trim();

		String words[]= str.split("\\s+");

		ArrayList<String> reversed= new ArrayList<>();

		for(int i=words.length-1; i>=0; i--){
			reversed.add(words[i]);
		}

		return String.join(" ", reversed);
	}

    public static void main(String args[]){
        String str="I love you!";
        System.out.println(reverseString(str));
    }
}
