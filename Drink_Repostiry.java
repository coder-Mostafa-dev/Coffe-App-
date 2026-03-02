package oop_projects.categories.drink;
import oop_projects.data.Drinks_data;

import java.util.Scanner;
class Drink_Repostiry extends Drink {
    ///  Create drink
    ///  update value to the Drink
    /// remove a Drink

    public void msg(String msg){
        System.out.print("Enter "+msg);
    }


    public void create_new_drink(){
        ///  Create a new Drink
        ///  1. id , name , Type , all categoris of Drink .
        ///  2. set all from admin => save all with in a file or anything .
        ///  3.
        int id ;
        String name ;
        double price ;
        int type_drink ;
        int size_drink ;
        Drink drink  =new Drink();
        Scanner input = new Scanner (System.in);
        System.out.print("Enter ID : ");
        try{

            ///  adding an information of The Drink .
            msg("ID :");
            id =input.nextInt();
            drink.set_id_Drink(id);
             //--
            msg("Name :");
            name = input.next();
            drink.set_name_Drink(name);
            //--
            msg("Price :");
             price= input.nextInt();
             drink.set_price_Drink(price);
            //--
            System.out.println("Note >> Type of Drink and size have only 2 values  < 1 OR 2 >");
            msg("Type");
            type_drink = input.nextInt();
            drink.set_Type_Drink();
            //--
            msg("Size");
            size_drink  = input.nextInt();

        } catch (Exception e) {
            System.out.println("Invalid Data.");
        }

        Drinks_data drinks_data = new Drinks_data();
        drinks_data.setDrinks_data();
    }
}
