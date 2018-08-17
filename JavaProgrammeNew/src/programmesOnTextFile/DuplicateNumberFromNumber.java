package programmesOnTextFile;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DuplicateNumberFromNumber 
{

	public static void main(String[] args) 
	{
		List<Integer> digits = new ArrayList(); 
		
		int num = 121;
		
		int length = Integer.toString(num).length();
		
		while(num>0)
		{
			int digit = num%10;
			
			num = num/10;
			digits.add(digit);
		}
		for(int i=0;i<digits.size();i++)
		{
			for(int j=i+1;j<digits.size();j++)
			{
				int k= digits.get(i);
				int l = digits.get(j);
				if(k==l);
				{
					System.out.println("Duplicate no is:"+ digits.get(i));
					
				}
				
				
				
					
				
			}
		}
		
		
		
		

	}

}
