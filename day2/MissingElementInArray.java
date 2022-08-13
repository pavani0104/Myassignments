package week1.day2;

import java.util.Arrays;

public class MissingElementInArray

{
public static void main(String[] args) {
	
	
	int array1[]= {2,8,7,5,4,3,1};
	
	Arrays.sort(array1);
	
	int len=array1.length;
	
	
	
	for(int i=0;i<len;i++)
	{
		int c =0;
		
		if (c!=array1[i])
			
			System.out.println("the missing element is " +array1[i]);
		
			
		}
	}
}

