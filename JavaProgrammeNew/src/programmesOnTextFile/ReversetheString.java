package programmesOnTextFile;

public class ReversetheString 
{

	public static void main(String[] args) 
	{
	// take the rev as a String variable and another variable for String
		
		String s = "cirricullum";
		String rev = "";
		
		for(int i = s.length()-1;i>0;i--)
		{
			rev= rev+s.charAt(i);// charAt i returns character at periculat index
			
		}
		System.out.println(rev);
		
		

	}

}
