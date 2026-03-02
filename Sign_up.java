package oop_projects.auth;

import java.io.PushbackReader;

public class Sign_up {
    ///  Creating attributes for SignUp operation .
    private int id;
    private String username;
    private String password ;
   ///  Adding the value to variabeles By Setters
   public    void set_id (int id ){
       this.id = id;
   }
   public void set_username (String username ){
        this.username = username;
    }
    public void set_password (String  password ){
        this.password = password;
    }
    ///  Return the values of variabels .
    public int get_id(){
        return id;
    }
    public String get_username(){
        return username;
    }

    public String get_password(){
        return password;
    }
}
