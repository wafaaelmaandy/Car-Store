package carstore;

/*
Authors:   All Group
partener and correction : the leader of team Wafaa Elsaeed
date : during studing at firstTerm and mid trem vacation
Summary of CarStore :
1- represent details of Car store 
2- has some motheds that make buying process easy  
*/

import java.util.HashMap;
 public class CarStore extends Profile {
     
     
    //additional  atributes car store has 
    private static final int YEAROFSET =1995;
    private static final  String DESCRIPTION = "We love Cars--We love People.. Come experience The Car Store difference.";
    
    // car store  has a three hashmaps that showing staff,customers and inventory 
    private  HashMap <Integer,Staff> staff = new HashMap<>() ;
    private  HashMap <Integer,Customer> customers = new HashMap<>() ;
    private  HashMap <Integer,Vehicle> inventory = new HashMap<>() ;

  
  
    //constructor
    public CarStore (String name, String address, String contactNumber, String website,
            int ID) {
        super(name, address, contactNumber, website, ID);
    }
    
    
   //3 main methods insert ,delete,search that used by car store to make work easy
    
    
   //Employee
    
   public void insertEmployee(Staff employee){
  staff.put(employee.getId(), employee);}
   
    
    public Staff searseStaff(int ID){
    return staff.get(ID);
    }
    
    
    public void deleteEmpoyee(int ID){
    staff.remove(ID);}
    
    
    // Customer
    
   public void insertCustomer(  Customer customer){
  customers.put(customer.getId(), customer);}
   
   
    public Customer searseCustomer(int ID){
    return customers.get(ID);
    }
    
    
    public void deleteCustomer(int ID){
    customers.remove(ID);}
    
    
   // Car
    
    
   public void insertCar( Vehicle car){
  inventory.put(car.ID, car);}
   
   
    public Vehicle searseCar(int ID){
    return inventory.get(ID);
    }
    
    
    public void deleteCar(int ID){
    inventory.remove(ID);}
   
    
    /*
    Seter and getter
    Description: the purpose of this fuctions :- Set and get the value of the instance variable 
    */
    public int getyearOfset(){
        return YEAROFSET;
    }
    
    
  
    
    public String getdescription(){
    return DESCRIPTION;
}

//Description: this function is type of override which used to show details ofatributes of class .

@Override
public String toString(){
    return  "name          : " +name+
            "\ndescribion    : "+ DESCRIPTION
            +"\nYearofSet     : " +YEAROFSET
            + "\nwebsite       : "
            +email+
            "\naddress       : "+address+
            " \nContactNumber : "+contactNumber;
            }


// Description:the purpose of this fuction :-  copy of the object on which it is called

@Override
 public Profile clone(){
CarStore C = new CarStore(name,  address,  contactNumber,  email,
             ID );
        return C;
    }
 
 
 // Description:the purpose of this fuction :-  compare the object on which it is called with its parmeters
 @Override
 public boolean equals(Object O){
     CarStore c =(CarStore)O;
        return super.equals(O)&& c.getdescription().equals(DESCRIPTION)
                &&c.getyearOfset()==YEAROFSET;
     
     
     
 }
 
 
 /*
summary of  show Inventory
parameters : no thing
Return :no thing 
Description :- show  the basic details of  all vehicles in invevtory 
*/
 public void showInventory(){
  for (int key :inventory.keySet()){
  System.out.println(inventory.get(key).showDetetails());
  }  
 }
 
 /*
summary of show Staff Details
parameters : no thing
Return :no thing 
Description :- show   details of  all employees in car store 
*/
  public void showStaffDetails(){
  for (int key :staff.keySet()){
  System.out.println(staff.get(key).toString());
  }  
 }
  
  
  /*
summary of  showCustomersDetails 
parameters : no thing
Return :no thing 
Description :- show  the basic details of  all Customers in Car store
*/
   public void showCustomersDetails(){
  for (int key :customers.keySet()){
  System.out.println(customers.get(key).toString());
  }  
 }
   
   
 /*
summary of  search By Model
parameters :String : model of car
Return :no thing 
Description :- search about given model return  the basic details of  all vehicles matches this model in invevtory 
*/
 public void searchByModel(String model){
       HashMap <Integer,Vehicle> search = new HashMap<>() ;
  for (int key :inventory.keySet()){
   if(inventory.get(key).getModel().equalsIgnoreCase(model)){
       search.put(key,inventory.get(key) );
   }}
    for (int key :search.keySet()){
  System.out.println(search.get(key).toString());
  }  
 }
 
 
 /*
summary of  search By Make
parameters :String : make of car
Return :no thing 
Description :- search about given make return  the basic details of  all vehicles matches this MAke in invevtory 
*/
  public void searchByMake(String make){
       HashMap <Integer,Vehicle> search = new HashMap<>() ;
  for (int key :inventory.keySet()){
   if(inventory.get(key).getMake().equalsIgnoreCase(make)){
       search.put(key,inventory.get(key) );
   }}
    for (int key :search.keySet()){
  System.out.println(search.get(key).toString());
  }  
 }
  
  /*
summary of  search By price
parameters :2 doubles lower price and heigher price customer want 
Return :no thing 
Description :- search about given prices return  the basic details of  all vehicles matches this prices in invevtory 
*/
 public void searchByPrice(double from ,double to ){
       HashMap <Integer,Vehicle> search = new HashMap<>() ;
  for (int key :inventory.keySet()){
   if(inventory.get(key).getPrice()>=from &&inventory.get(key).getPrice()<=to ){
       search.put(key,inventory.get(key) );
   }}
    for (int key :search.keySet()){
  System.out.println(search.get(key).toString());
  }  
 }
 
 
}

