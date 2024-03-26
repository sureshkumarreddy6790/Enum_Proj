package com.suresh.enumtask;


enum ManagerType
{
	HR,SALES;
}
public class Employee 
{
   private String ename;
   private int empId;
   private double salary;
   
   public Employee()
   {
	   
   }
   public Employee(String name,int empId,double salary)
   {
	   this.ename=name;
	   this.empId=empId;
	   this.salary=salary;

   }
   
   public void setName(String name)
   {
	   this.ename=name;
   }
   public void setId(int empId)
   {
	   this.empId=empId;
   }
   public void setSalary(double sal)
   {
	   this.salary=sal;
   }
   
   public String getName()
   {
	   return this.ename;
   }
   public int getId()
   {
	   return this.empId;
   }
   public double getSalary()
   {
	   return this.salary;
   }
}
class Manager extends Employee
{
	private ManagerType type;
	
	public Manager()
	{
		
	}
	public Manager(String name,int id,double salary,ManagerType type)
	{
		super(name,id,salary);
		this.type=type;
		//this.setEmployeeSalary(salary);
	}
	
	public void setEnum(ManagerType type)
	{
		this.type=type;
	}
	public ManagerType getEnum()
	{
		return type;
	}
	@Override
	public void setSalary(double sal)
	{
		if(type==ManagerType.HR)
		{
			super.setSalary(this.getSalary()+10000);
		}
		if(type==ManagerType.SALES)
		{
			super.setSalary(this.getSalary()+5000);
		}
	}
}
class Clerk extends Employee
{
    private int speed;
    private int accuracy;
    int count=0;
    public Clerk()
    {
    	
    }
    public Clerk(String name,int id,double salary,int s,int a)
    {
    	super(name,id,salary);
    	this.speed=s;
    	this.accuracy=a;
    	//this.setSalary(salary);
    }
    
    public void setSpeed(int speed)
    {
    	this.speed=speed;
    	this.setSalary(this.getSalary());
    }
    public void setAccuracy(int accu)
    {
    	this.accuracy=accu;
    	this.setSalary(this.getSalary());
    }
    public int getSpeed()
    {
    	return speed;
    }
    public int getAccuracy()
    {
    	return accuracy;
    }
    @Override
    public void setSalary(double sal)
    {
    	if(speed>70 && accuracy>80 && count==0)
    	{
    		super.setSalary(sal+1000);
    		count++;
    	}
    	else
    	{
    		super.setSalary(sal+ 0);
    	}
    }
}
