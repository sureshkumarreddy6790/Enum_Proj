package com.suresh.enum_class;
enum Week
{
	 SUNDAY
	 {
		 @Override
		 public String toString()
		 {
			 return "SUNDAY";
		 }
		 public void m1()
		 {
			 System.out.println("m1 method");
		 }

	 },MONDAY,TUESDAY;
	 @Override
	 public String toString()
	 {
		 return "HELLO WORLD";
	 }
	 public void m1()
	 {
		 System.out.println("outside m1() method");
	 }
}

public class EnumDemo
{
	public static void main(String[] args)
	{
        Week[] w = Week.values();
        for(Week w1:w)
        {
	       System.out.println(w1);
        }
        for(Week w2:w)
        {
        	System.out.println(w2+" : "+w2.ordinal());
        }
        for(Week w3:w)
        {
        	System.out.println(w3.name());
        }
        System.out.println("----------------------------------");
        System.out.println(Week.SUNDAY.toString());
        System.out.println(Week.MONDAY.toString());
        Week.SUNDAY.m1();
        Week.MONDAY.m1();
	}
}
