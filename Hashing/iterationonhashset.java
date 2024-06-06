import java.util.HashSet;

public class iterationonhashset {
     public static void main(String args[]){
        HashSet<String> cities= new HashSet<>();
        cities.add("Solapur");
        cities.add("Bengaluru");
        cities.add("Pune");
        cities.add("NewYork");
        cities.add("Seoul");
        
        
        //using enhanced for loop
        for (String city : cities) {
            System.out.println(city);
            
        }
    }
}
