package home.assignments;

//derived class 
class Car extends Vehicle  
{ 
 
// the Car subclass adds one more field 
public String color; 

// the Car subclass has one constructor 
public Car(int gear,int speed, String color) 
{ 
   // invoking base-class(Vehicle) constructor 
   super(gear, speed); 
   this.color=color;
}  
     
// the Car subclass adds one more method 
public void setColor(String color) 
{ 
   this.color=color;
}  
 
// overriding toString() method of Vehicle to print more info 
@Override
public String toString()  
{ 
     
   return (super.toString()+"\nColor is "+color); 
} 
 
} 
