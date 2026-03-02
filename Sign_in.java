package oop_projects.auth;

public class Sign_in
{
    private String username;
    private String password ;
    ///  Adding the value to variabeles By Setters
    public void set_username (String username ){
        this.username = username;
    }
    public void set_password (String  password ){
        this.password = password;
    }
    ///  Return the values of variabels .
    public String get_username(){
        return username;
    }

    public String get_password(){
        return password;
    }
}
