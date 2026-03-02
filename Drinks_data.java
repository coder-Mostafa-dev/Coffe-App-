package oop_projects.data;

import oop_projects.categories.drink.Drink;

import java.util.ArrayList;

public class Drinks_data
{
    private int i = 0;

     private   ArrayList <Drink> drinks_data ;
   /// passing  the value of the Drink. to Drink_Data Array .
    public  void setDrinks_data(Drink drinks_data){
             this.drinks_data.add(drinks_data);

    }
   ///  Getting the Drinks-data
    public Drink getDrink_data (){
        if (i <drinks_data.size()){
            return drinks_data.get(i++);
        }
        return null ;
    }

    public void update_Drink(int drink_id){
        Drink drink_update = drinks_data.get(drink_id) ;



    }

}
