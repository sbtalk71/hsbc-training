package home.assignments;
 //base class 
class Vehicle  
{ 
 // the Vehicle class has two fields 
 public int gear; 
 public int speed; 
       
 // the Vehicle class has one constructor 
 public Vehicle(int gear, int speed) 
 { 
     this.gear = gear; 
     this.speed = speed; 
 } 
       
 // the Vehicle class has three methods 
 public void applyBrake(int decrement) 
 { 
     speed -= decrement; 
 } 
       
 public void speedUp(int increment) 
 { 
     speed += increment; 
 } 
   
 // toString() method to print info of Vehicle 
 public String toString()  
 { 
     return("No of gears are "+gear+"\n"+ "speed of vehicle is "+speed); 
 }  
} 


