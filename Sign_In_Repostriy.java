package oop_projects.auth.repositry;
import oop_projects.auth.Sign_in;

import java.util.Scanner;

public class Sign_In_Repostriy
{

    ///  Creating a method Sign in
    public  void Sign_in(){
        Scanner input = new Scanner(System.in);
        ///  intialize 2 var with default values
        String username ="Unknown";
        String password ="1234" ;
        /// Printing a genral msg to add the value to the 2 var
        System.out.print("Enter The 2 values  1.Username - 2.password :  ");
        ///  check if values is true or not .
        try {

            username = input.next();
            password = input.next();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

         ///  passing this value to Sign in class
        Sign_in sign_in = new Sign_in();
        sign_in.set_username(username);
        sign_in.set_password(password);
        System.out.println("Welcome  < "+username +" >");
    }
}
