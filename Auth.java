package oop_projects.auth;

import oop_projects.auth.repositry.Sign_In_Repostriy;
import oop_projects.auth.repositry.Sign_Up_Repostriy;

public class Auth
{
   ///  Sign in , Sign up
    public enum  State{
        SignIn,SignUp
   }

   public void Check_Auth(State state)
   {
         switch (state){
             case State.SignUp:
                 Sign_Up_Repostriy sign_up_repo = new Sign_Up_Repostriy();
                 sign_up_repo.CreateAccount();
                 break;


             case State.SignIn :
                 Sign_In_Repostriy sign_in_repo= new Sign_In_Repostriy();
                 sign_in_repo.Sign_in();
                 break;
             default:
                 System.out.println("Error, non logical ");

         }
   }
}
