package oop_projects.auth.repositry;
import oop_projects.auth.Sign_up;
import java.util.Scanner;

public class Sign_Up_Repostriy
{
    ///  Creating a method to Create an Account
    public  void CreateAccount(){
        Scanner input = new Scanner(System.in);
        ///  intialize 2 var with default values
         int id=0;
         String username ="Unknown";
         String password ="1234" ;
        /// Printing a genral msg to add the value to the 2 var
       System.out.print("Enter The 3 values  1.ID - 2.Username - 3.password :  ");
         ///  check if values is true or not .
            try {
            id = input.nextInt();
            username = input.next();
            password = input.next();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        ///  passing this value to Sign in class

        Sign_up sign_up = new Sign_up();

        sign_up.set_id(id);
        sign_up.set_username(username);
        sign_up.set_password(password);
        System.out.println("Welcome  < "+username +" >");
    }
}
