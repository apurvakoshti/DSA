public class updateoperationonarray {
    public static void update(String names[]){
        for(int i=0; i< names.length; i++){
            names[i] += " , hello";
        }
    }
    public static void main(String args[]){
        String names[]={"apurva", "raj"};
        update(names);

        //iteration over an array
        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println();


    }
}
