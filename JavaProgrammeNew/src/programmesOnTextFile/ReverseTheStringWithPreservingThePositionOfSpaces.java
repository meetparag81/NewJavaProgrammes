package programmesOnTextFile;

public class ReverseTheStringWithPreservingThePositionOfSpaces 
{

	private static int i;
	private static String inputstring;

	public static void main(String[] args) 
	{
		String s = "I Am Not String";
		
		// conver string into char array
		char[] inputstringarray = s.toCharArray();
				
				// Create a new char array with same size of 
		char[] resultarray = new char[inputstringarray.length];
		
		// ieraterate the "inputstring" array to see the space in the string and inser it in the result array
		
		for(  i=0;i<inputstringarray.length;i++)
		{
			if(inputstringarray[i]==' ')
			{
				resultarray[i] = ' ';
				
			}
			
		}
		// initalize the j with the lenght of result array
		
		int j= resultarray.length-1;
		// second for loop, we copy every non-space character of inputStringArray from first to last at 'j' position of resultArray
		for (i=0;i<inputstringarray.length;i++)
		{
			if(inputstringarray[i] !=' ')
			{
				if(resultarray[j]==' ')
				{
					j--;
				}
				
				resultarray[j]= inputstringarray[i];
						j--;
						
						
			}
			
			
		}
		System.out.println(inputstring +"---->"+String.valueOf(resultarray));
		

	}

}
