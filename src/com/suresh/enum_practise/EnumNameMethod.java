package com.suresh.enum_practise;

class son
{
	int a;
	son(int a)
	{
		this.a=a;
	}
	public void m1()
	{
		System.out.println("m1 moeth"+" "+this.a);
	}
}
enum Month 
{
   JAN,FEB,MAR;
   private Month()
   {
	   System.out.println("Month");
   }
}
public class EnumNameMethod 
{
    public static void main(String[] args)
    {
    	//Month m =new Month();
    	//System.out.println(Month.JAN.name());
    	System.out.println(Month.FEB);
    	son s1 = new son(10);
    	s1.m1();
    	son s2 = new son(20);
    	s2.m1();
    }
}
