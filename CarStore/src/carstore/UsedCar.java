package carstore;
/*
Authors:  Somaya Mohamed&& Abeer Ragab .
partener and correction : the leader of team Wafaa Elsaeed
date : during studing at firstTerm and mid trem vacation
Summary of Used Car: 
1- Repesent used cars detials 
*/


public class UsedCar extends Vehicle {
    
    
    // additional  atributes used cars has 
    private double KilometerTravel ;
    private boolean repair ;
    private  int NoOfOwners ;

    
    //constructor
    public  UsedCar(String model, String make, String madeIn, String colour,String
         FuelType,int ID, double speed, double power ,double price, int 
         YearIntroduced,boolean Airbags ,boolean Heater ,
         boolean  Speakers,boolean FogLamps , double
         KilometerTravel,int NoOfOwners,boolean repair) 
    {
        super(model, make, madeIn, colour, FuelType,ID, speed,  power,price,
        YearIntroduced ,Airbags, Heater ,Speakers ,FogLamps) ;
        this.KilometerTravel=KilometerTravel;
        
        this.repair=repair;
        this.NoOfOwners=NoOfOwners ;
    }

    
    
/*
Seter and getter
Description: the purpose of this fuctions :- Set and get the value of the instance variable 
*/
public void setPeriodOfUse(double KilometerTravel){
this.KilometerTravel=KilometerTravel ;}


public double getKilometerTravel(){
return KilometerTravel ; }


public void setRepair(boolean repair ){
this.repair=repair;
}


public boolean getRepair(){
return repair ;
}




//Description: this function is type of override which used to show details of class

@Override
public String toString(){
return super.toString()+ "\t"+getKilometerTravel()+"\t "+NoOfOwners+getRepair()+"\n";}


// Description:the purpose of this fuction :-  copy of the object on which it is called

@Override
public  UsedCar clone (){
 UsedCar car1=new  UsedCar (model,make,madeIn,colour, FuelType,ID,speed,power,
        price,YearIntroduced, Airbags ,Heater,Speakers, FogLamps
           ,KilometerTravel,NoOfOwners,repair);
return car1;}


// Description:the purpose of this fuction :-  compare the object on which it is called with its parmeters

@Override
public boolean equals(Object m){
 UsedCar car =( UsedCar)m;
        return super.equals(m)&&car.KilometerTravel==KilometerTravel&&car.repair==repair;
}

}
