package programmesOnTextFile;

public class Fibonaci 
{

	public static void main(String[] args) 
	{

		// take three variable
		int a = 0;
		int b = 1;
		int c = 0;
		int count = 10;

		System.out.print(a + "," + b + ",");

		for (int i = 0; i < count; i++) 
		{
			c = a + b;
			a = b;
			b = c;
			

			System.out.print(c+ ",");

		}

	}
}
