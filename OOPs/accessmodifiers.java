class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password= pwd;
    }

    public String getPassword(){
        return password;
    }

}
public class accessmodifiers {
    public static void main(String args[]){
        BankAccount myAccount= new BankAccount();
        myAccount.username="apurvakoshti";
        System.out.println(myAccount.username);
        // myAccount.password="abcd";
        // the above line will throw error because it is considered to be private and cannot be accessed outside the class
        // System.out.println(myAccount.password);
        myAccount.setPassword("raj");
        System.out.println(myAccount.getPassword());

    }
    
}
