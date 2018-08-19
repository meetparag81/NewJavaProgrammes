package programmesOnTextFile;

public class Palidrom {

	public static void main(String[] args)
	{
		// take number in one veriable
		 int num = 121;
		 int temp = num;
		 int sum = 0;
		 int r = 0;
		 
		 while(num>0)
		 {
			 r=num%10;
			 sum = sum*10 + r;
					 num=num/10;
		 }
		 if(sum==temp)
		 {
			 System.out.println("Number is palidrome");
		 }
		 else
		 {
			 System.out.println("Number is not palidrom");
		 }

	}

}
