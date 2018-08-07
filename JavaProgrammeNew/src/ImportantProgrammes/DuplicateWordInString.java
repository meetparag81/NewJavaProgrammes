package ImportantProgrammes;

public class DuplicateWordInString {

	public static void main(String[] args)
	{
		String s= "cirricullum";
		int length= s.length();
		int count =0; int i, j;
		char arr[] = s.toCharArray(); 
		for( i =0;i<s.length();i++)
		{
			for( j=s.length()-1;j<s.length()+1;j--)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			
		}
		System.out.println("Duplcate word is"+ arr[i] + "count is" + count);

	}

}
