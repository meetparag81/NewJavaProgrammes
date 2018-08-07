package ImportantProgrammes;

public class DynamicArray 
{

	public static void main(String[] args) 
	{
		int Sum = 0;
		int Sum_N;
		int[] arrA = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		int size = 10;
		Sum_N = size * (size + 1) / 2;
		for (int i = 0; i < arrA.length; i++) 
		{
			Sum += arrA[i];

		}
		System.out.println("Missing number is :" + (Sum_N-Sum) );

	}
}
