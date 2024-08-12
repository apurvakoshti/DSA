public class addressofindex {
    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        int baseAddress= 100;
        int i=2;
        int sizeElement=4;
        int addressOfIthIndex= baseAddress+ (i*sizeElement);
        System.out.println(addressOfIthIndex);
       }
}
