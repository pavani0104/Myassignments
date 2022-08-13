 package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		
		int num=6869878;
		
		int temp=0;
		
		
				
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				temp++;
	
				}
			}
			
	if (temp==0)
		
		System.out.println(num + " is prime ");
	else 
		System.out.println( num + " is not prime ");
	
	}
	
	}

