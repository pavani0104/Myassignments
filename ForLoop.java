package week1.day2;

import java.util.Arrays;


public class ForLoop {

	public void oddNum()
	{
	System.out.println("Here are the odd nuumbers :");
		int i=51;
		while(i<=77)
		{
			System.out.println(i);
		i=i+2;
	}
	}
	
	public void secLargest()
	{
		int [] numb = { 22,67,98,1,34,58,99};
		int length= numb.length;
		System.out.println("length of the array is :"+length);
		Arrays.sort(numb);
		System.out.println("The sorted array:");
			for(int i=0;i<length;i++)
			{
				System.out.println(numb[i]);
			}
				
			System.out.println(" the second largest number is:" +numb[length-2]);
				
				
		}
	public static void main (String args[])
	{
		ForLoop obj=new ForLoop();
		
		
		obj.oddNum();
		
		obj.secLargest();
	}
	
		
	}
	


