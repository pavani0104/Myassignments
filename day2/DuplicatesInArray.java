package week1.day2;

public class DuplicatesInArray {

	public static void main(String[] args)
	{
	
		int array[]= {2,2,6,5,7,6,8};
		
		
		int length=array.length;
		int count;
		
		for(int i=0;i<length;i++)
		{
			count = 0;
			for(int j=i+1;j<length;j++)
				
			{
			if(array[i]==array[j])
				
				count++;
			}
		
			if(count>0)
				System.out.println("the duplicate element is :" +array[i]); 
			}
		}

}
	

