//pass by value and pass by reference
public class passingarraysasarguments {
    public static void update(int marks[], int nonChangeable){
        nonChangeable=15;
        for(int i=0; i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
        
    }
    public static void main(String args[]){
        int marks[]={1,2,3};
        int nonChangeable=10;
        update(marks, nonChangeable);
        System.out.println(nonChangeable);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
    
}
