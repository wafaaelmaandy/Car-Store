package carstore;
/*
Authors: Salma Ashraf && Ayda Ibrahim .
partener and correction : the leader of team Wafaa Elsaeed
date : during studing at firstTerm and mid trem vacation
Summary of Staff :
1-   Staff class represents  details of Empyees  
*/

public class Staff extends Profile {
    
    
      //additional  atributes  staff  has 
    private String position;
    private double salary;
    private double retier;

    
    //constructor
    public Staff(String name, String address, String contactNumber, String email, int ID,
     String position,double salary,double retier) {
        super(name, address, contactNumber, email, ID);
        this.salary=salary;
        this.retier=retier;
        this.position=position ;
    }

    
    
    /*
    Seter and getter
    Description: the purpose of this fuctions :- Set and get the value of the instance variable 
    */
    public void setPosition(String position){
       this. position=position;}
    
    
    public String getPosition(){
      return position;}
    
    
    public void setSalary(double salary ){
     this.salary=salary;}
    
    
    public double getSalary(){
    return salary;}
    
    
    public void setRetire(double retier ){
    this.retier=retier;}
    
    

    public Double getRetire(){
    return retier;}



    
// Description:the purpose of this fuction :-  copy of the object on which it is called

@Override
public Profile clone(){
    Staff f = new Staff(name,address,contactNumber,email,ID,position,
            salary,retier);
    return f;
}


// Description:the purpose of this fuction :-  compare the object on which it is called with its parmeters

@Override
public boolean equals(Object s){
    Staff f=(Staff)s;
        return super.equals(s)&&f.getPosition().equals(position)
                &&f.getRetire()==retier&&f.getSalary()==salary;
    }


//Description: this function is type of override which used to show details of class

@Override
public String toString(){
    return(super.toString()+"\t"+position+ "\t "+salary+"     "+retier
            );
}

 
    }



