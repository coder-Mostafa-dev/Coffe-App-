package oop_projects;

import oop_projects.auth.Auth;

import java.util.Scanner;

public class App
{


    public  void app(){
        System.out.println("Welcome to our app ,");
        System.out.print("1)Sign IN 2) Sign Up  Answer : ");
        int choose = 0;
        Scanner input = new Scanner(System.in);
        try{
             choose = input.nextInt();


        } catch (Exception e) {
            System.out.println("Invalid Choose");
        }
        Auth auth = new Auth();
      switch (choose){
          case 1:
              auth.Check_Auth(Auth.State.SignIn);
              break;
          case 2:
              auth.Check_Auth(Auth.State.SignUp);
              break;
          default:
              System.out.println("App is Closed ");
      }

    }


    ///  Auth
    ///


}
