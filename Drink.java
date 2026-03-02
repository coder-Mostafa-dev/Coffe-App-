package oop_projects.categories.drink;

public  class Drink {
   /// ID , Name , Size , price , Type
   ///  intilize a var of Drink
    private int id;
    private String  name ;
    private double price ;
    private Type type;
    private Size size ;

    ///  Creating a constant values
    private enum Type {
        hotDrink,
        coldDrink
    }
    private enum Size {
        Normal , Double
    }
///  Set all var
///
    public void set_id_Drink(int id){
        this.id = id;
    }
    public void set_name_Drink(String name){
        this.name = name;
    }
    public void set_price_Drink(double price){
        this.price = price;
    }public void set_Type_Drink(Type type){
        this.type = type;
    }

    public void set_size_Drink(Size size){
        this.size = size;
    }
  ///  Return the values of var

  public  int get_id_Drink(){
      return id;

  }public  String get_name_Drink(){
        return name;

    }public  double get_price_Drink(){
        return price;

    }public  Type get_type_Drink(){
        return type;

    }public  Size get_size_Drink(){
        return size;

    }

}
