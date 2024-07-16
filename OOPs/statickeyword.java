class Student{
    String name;
    int roll_no;

   static String schoolName;
}
public class statickeyword {
    public static void main(String args[]){
        Student s1= new Student();
        s1.schoolName="IMS";
        System.out.println(s1.schoolName);

        Student s2= new Student();
        System.out.println(s1.schoolName); // it should give same name of school

    }
}
