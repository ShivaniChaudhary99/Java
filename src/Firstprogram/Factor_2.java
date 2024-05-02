package Firstprogram;

public class Factor_2       //private is used as access modifier 
{ 
	int passengers=8; // number of passengers 
	int fuelcap=6; // fuel capacity in gallons
	int mpg=7; // fuel consumption in miles per gallon

	
	void range(int mpg,int fuelcap)  //method overwriting
	{
	System.out.println("Range is " + fuelcap * mpg);
	}
	void range()  //polymorfism
	{
	System.out.println("Range is " + fuelcap * mpg);
	}
		public static void main(String args[])
		{
		Factor_2 A =new Factor_2();
		A.range();
	}
	
}