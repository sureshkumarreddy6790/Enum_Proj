package com.suresh.enumtask;

public class CoffeeOrder 
{
   private TypeOfCoffee type;
   private SizeOfCoffee size;
   
   public CoffeeOrder(TypeOfCoffee type,SizeOfCoffee size)
   {
	   this.type=type;
	   this.size=size;
   }
   
   public String getOrderDetails()
   {
	   return this.type+" size is :"+this.size;
   }
}
