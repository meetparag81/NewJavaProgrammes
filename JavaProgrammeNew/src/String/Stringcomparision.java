package String;

public class Stringcomparision {

	public static void main(String[] args) 
	{
	String s1 = "zensoft";
	String s2 = "zensoft";
	String s3 = new String("zensoft");
	
	System.out.println(s1==s2);//true
	System.out.println(s2==s3);//false
	System.out.println(s1.equals(s2));//true
	System.out.println(s1.equals(s3));//true
	
	System.out.println("=============");
	String s4 = "zensoft1";
	String s5 = "zensoft";
	String s6 = new String("zensoft");
	System.out.println(s4==s5);//false
	System.out.println(s5==s6);//false
	System.out.println(s4.equals(s5));//false
	System.out.println(s4.equals(s6));//false

	}

}
