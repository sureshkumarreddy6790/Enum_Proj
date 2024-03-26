package com.suresh.enumtask;

public class Main 
{
    public static void main(String[] args)
    {
    	Employee e = new Manager("raju",1,5000,ManagerType.HR);
    	System.out.println(e.getSalary());
    	e.setSalary(e.getSalary());
    	System.out.println(e.getSalary());
    	
    	Clerk c = new Clerk("raghu",1,4000,75,86);
    	System.out.println(c.getSalary());
    	c.setSalary(c.getSalary());
    	System.out.println(c.getSalary());
    	c.setAccuracy(90);
    	System.out.println(c.getSalary());
    	
    }
}
