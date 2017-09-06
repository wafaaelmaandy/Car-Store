package carstore;
/*
Authors: Esraa Ebrahem && Wafaa Elsaeed .
partener and correction : the leader of team Wafaa Elsaeed
date : during studing at firstTerm.
Summary of New Car :
1- represent details of  new cars
*/

public class NewCar extends Vehicle{
  
   
//constructor

    public NewCar(String model, String make, String madeIn,
            String colour,String FuelType ,int ID ,double speed, double power ,double price,int YearIntroduced
            ,boolean Airbags, boolean Heater  ,boolean Speakers ,boolean FogLamps  )
    {
        super(model, make, madeIn, colour,FuelType,ID, speed,  power,price,YearIntroduced,
                Airbags,Heater ,Speakers, FogLamps) ;
       
    }
    
    
    //Description: this function is type of override which used to show details ofatributes of class .

    @Override
public String toString(){
return 
        super.toString();}


// Description:the purpose of this fuction :-  copy of the object on which it is called

@Override
public NewCar clone(){
NewCar car = new NewCar( model, make, madeIn, colour, FuelType ,ID, speed, power ,
        price,YearIntroduced, Airbags, Heater ,Speakers,
       FogLamps) ; 
return car ;
}


// Description:the purpose of this fuction :-  compare the object on which it is called with its parmeters

 @Override
public boolean equals(Object o){
       return super.equals(o);
}

   
 
}

