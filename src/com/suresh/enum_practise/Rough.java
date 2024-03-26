package com.suresh.enum_practise;


interface Moveable1
{
	void move();
}
enum Color implements Moveable1
{
	RED
	{
		public void move()
		{
			System.out.println("RED OBJECT");
		}
	},GREEN
	{
		public void move()
		{
			System.out.println("GREEN OBJECT");
		}
	};
	public void move()
	{
		System.out.println("MOVE METHOD");
	}
	public static void m2()
	{
		System.out.println("m2 static method...");
	}
	enum Season
	{
		
	}
}
public class Rough
{
	public void m1()
	{
		
		enum Months
		{
			JAN,FED;
		}
		System.out.println(Months.JAN);
	}
    public static void main(String[] args)
    {
    	Color.RED.move();
    	Color[] c = Color.values();
    	System.out.println(Color.RED.ordinal());
    	System.out.println(Color.GREEN.ordinal());
    	for(Color c1:c)
    		System.out.println(c1+" : "+c1.ordinal());
    	new Rough().m1();
    	Color.m2();
    	//System.err.println(Color.YELLOW);
    	System.out.println(Color.RED.name());
    	Color str = Color.RED.valueOf("RED");
    	System.out.println(Color.RED.valueOf(null));
    }
}

