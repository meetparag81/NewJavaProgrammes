package programmesOnTextFile;

public class ArmstrongNo 
{

	public static void main(String[] args) 
	{
		int num = 153;
		int sum=0;
		int r = 0;
		int temp = num;
		
		while(num>0)
		{
			
			r = num%10;
			
			sum = sum +(r*r*r);
			
			num =num/10;
			
			
			
		}
		if(temp==sum)
		{
			System.out.println("No is armstrong");
		}
		else
		{
			System.out.println("No is not armstrong");
		}

	}

}
