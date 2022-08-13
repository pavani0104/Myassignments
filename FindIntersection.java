package week1.day2;

import java.util.Arrays;

public class FindIntersection 
{

	public static void main(String[] args)
	{
	
		int array1[]= {3,5,6,7,11,2,8};
		
		int array2[]= {4,11,5,7,2,9,8};
		Arrays.sort(array1);
		Arrays.sort(array2);
		int length1=array1.length;
		int length2=array2.length;

		for(int i=0;i<length1;i++)
		{
			for(int j=0;j<length2;j++)
			
			{
				if(array1[i]==array2[j])
				{
					
					
			System.out.println(array1[i]);
			}
		}
	}
}
}
				
		
