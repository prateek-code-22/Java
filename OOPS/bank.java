package OOPS;

class Account{
    public String name;  
    protected String email;
    private String password;

    // getter and setter
    public String getPassword(){
        return this.password;
    }

    //setter
    public void setPassword(String pass){
        this.password = pass;
    }

}

public class bank{
    public static void main(String args[]){
        Account acc1 = new Account();
        acc1.name = "Swiss";
        acc1.email = "hello@gmai.com";
        acc1.setPassword("abc");
    }
}