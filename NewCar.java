package week1.day2;

public class NewCar {
	public void carBrand()
	{
		System.out.println("car name is Benz");
	}
	public String getCarColor()
	{
		return "black";
	}
	public int GetEngineNo()
	{
		return 454536;
	}
	public int addTwoNum(int a , int b)
	{
		int c;
		c = a + b;
		return c;
	}
	public int subTwoNum(int x ,int y)
	{
		int z;
		z= x-y;
		return z;
	}
	public int mulTwoNum(int a , int b)
	
	{
		int c;
		c= a*b;
		return c;
		
	}
	public int divTwoNum(int x,int y)
	{
		int z=x/y;
		return z;
	}
public static void main (String args[])
{
	NewCar car=new NewCar();
	car.carBrand();
	System.out.println(" my car color is " +car.getCarColor());
	System.out.println("engibe no is " +car.GetEngineNo());
	int addition=car.addTwoNum(45,66);
	int subtraction=car.subTwoNum(34, 23);
	int multiply=car.mulTwoNum(23, 123);
	float divide=car.divTwoNum(24, 8);
	System.out.println("addition is :" +addition);
	System.out.println("subtraction is :"+subtraction);
	System.out.println("multiplication is :"+multiply);
	System.out.println("Division is :"+divide);
}
	
}

