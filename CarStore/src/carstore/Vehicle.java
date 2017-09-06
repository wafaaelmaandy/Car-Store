package carstore;

/*
Authors: Eman Hemeda && Eman Awad && Fatma Nabil.
partener and correction : the leader of team Wafaa Elsaeed
date : during studing at firstTerm and mid trem vacation
Summary of Vehicle:
the porbuse of this Vehicle is 
1- being the parent of UsedCar and NewCar class
2- showing details of cars
3- collection of most of types of cars.
*/


public class Vehicle {
    
//the atributes that any type of car shoud have it.

protected String model ;
protected String make ;
protected String madeIn ;
protected String colour ;
protected String FuelType ;
protected double speed ;
protected double price ;
protected   int ID ; 
protected double power ;
protected int YearIntroduced ;
protected boolean Airbags  ; 
protected  boolean Heater; 
protected  boolean Speakers ; 
protected  boolean FogLamps ; 



//constructor

public Vehicle(String model,String make,String madeIn,String colour, String FuelType ,int ID,
        double speed ,double power,double price ,int YearIntroduced ,boolean Airbags,
            boolean Heater ,boolean Speakers,boolean FogLamps
             ){
this.Speakers=Speakers;
this.Heater=Heater;
this.Airbags=Airbags;   
this.FogLamps=FogLamps;
this.FuelType=FuelType;
this.model=model;
this.make=make;
this.ID = ID;
this.colour=colour;
this.power=power ;
this.price=price;
this.YearIntroduced=YearIntroduced;
this.speed=speed;
this.madeIn=madeIn;
}



//Description: this function is type of override which used to show details ofatributes of class vehicle.


@Override
public String toString(){
return ""+getModel()+"\t"+getMake()+"\t"+YearIntroduced+
        "\t" +getMadeIn() +
        "\t"+getColour()+"\t"+FuelType+"\t"+getSpeed()+"\t"+ID+"\t"
        +getPower()+"\t" +price +"\t  "+getAirbags()+"\t "+getHeater()+
        "\t  "+getSpeakers()
                +"\t "+getFogLamps()+"\n" ;
}


 
// Description:the purpose of this fuction :-  copy of the object on which it is called

@Override
public Vehicle clone(){
Vehicle car = new Vehicle ( model, make, madeIn, colour,FuelType,ID, speed,  power,price,
        YearIntroduced  ,Airbags, Heater , Speakers,
           FogLamps) ; 
return car ;
}


// Description:the purpose of this fuction :-  compare the object on which it is called with its parmeters
 @Override
public boolean equals(Object o){
Vehicle car =(Vehicle)o ;
       return car.make.equals(make) && car.colour.equals(colour) 
               &&car.madeIn.equals(madeIn) && car.model.equals(model)
               && car.power==power && car.speed == speed &&car.price==price&&car.getSpeakers()==Speakers&&
               FogLamps==car.getFogLamps() &&
               Heater==car.getHeater()&&Airbags==car.getAirbags() ;
}


/*
summary of this function 
parameters : no thing
Return :( String ) 
Description:the purpose of this fuction :- show  the basic details of any vehicle
*/

public String showDetetails(){
return ""+getModel()+" "+getMake()+" "+
        " " +getMadeIn() +
        " "+getColour()+"   "+FuelType+"\t       "+YearIntroduced+"\t\t"+getSpeed()+"     "+ID+"\t"
        +getPower()+"\t" +price ;
}


/*
Seter and getter
Description: the purpose of this fuctions :- Set and get the value of the instance variable 
*/

public void setModel(String model){
this.model = model;
}


public void setMake(String make){
this.make=make;
}


public void setFuelType(String FuelType){
this.FuelType=FuelType;
}


public void setMadeIn(String madeIn){
this.madeIn=madeIn;
}


public void setColour(String colour){
this.colour=colour;
}


  public  void setAirbags( boolean Airbags){
   this.Airbags=   Airbags;}
   
  
   public boolean getAirbags(){return Airbags ;}
   
   
   public  void setHeater(boolean Heater){
   this.Heater=Heater;}
   
   
    public boolean getHeater(){return Heater ;}

    
   public  void setFogLamps(boolean FogLamps){
   this.FogLamps=FogLamps;}
   
   
public boolean getFogLamps(){return FogLamps ;}

    
public  void setSpeakers(boolean Speakers){
   this.Speakers=Speakers;}
   
   
    public boolean getSpeakers(){
        return Speakers ;}
    

public void setYearIntroduced(int YearIntroduced){
this.YearIntroduced=YearIntroduced;
}


public void setPower(double power){
this.power=power;
}


public void setSpeed(double speed){
this.speed=speed;
}


public void setPrice(double price){
this.price=price;
}


public String getModel(){
return model;
}


 public String getFuelType(){
return FuelType ;
}
 
 
public String getMake(){
return make;
}


public String getMadeIn(){
return madeIn;
}


public String getColour(){
return colour;
} 


public int getID(){
return ID;
}


public int getYearIntroduced(){
return YearIntroduced ;
}


public double getSpeed(){
return speed;
}


public double getPower(){
return power;
}


public double getPrice(){
return price;
}


}
