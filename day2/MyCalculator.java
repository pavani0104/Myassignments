package week1.day2;

public class MyCalculator {
	
	
	public static void main(String args[])
	{
		Calculator calc=new Calculator();
		
		int sum = calc.add(12,13,17);
		int subtract= calc.sub(89, 45);
		double product=calc.mul(53853549, 5278);
		float  divide=calc.div(8.9f,2.4f);
		
		System.out.println("addition is :"+sum);
		System.out.println("subtraction is:"+subtract);
		System.out.println("product is :"+product);
		System.out.println("division is "+divide);	
	}

}
