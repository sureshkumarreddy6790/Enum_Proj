package com.suresh.enum_practise;
enum Movie {
	Pathaan, SIR, Hit, Geme_over, Lost;
	}
//class Age
//{
//	Age(int a)
//	{
//		super(a);
//	}
//}
	
public class ValuesOfMMethod {
	public static void main(String[] args)
	{
		 System.out.println(ValuesOfMMethod.getMovie("sir"));
    }
	public static Movie getMovie(String s)
	{									  // sir
		 return Enum.valueOf(Movie.class, s.toUpperCase());
	}
    public static Movie getMovie(int n)
    {
		 return Movie.values()[n];
	}
}


