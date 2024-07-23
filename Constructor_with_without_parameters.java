package javaprograms.assignments;

public class Constructor_with_without_parameters {
	
	
	Constructor_with_without_parameters()  //constructor without parameters
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println("Addition="+c);
	}
	
	Constructor_with_without_parameters(int a,int b)  //constructor with parameters
	{
		int c=a-b;
		System.out.println("Subtraction="+c);
	}

	public static void main(String[] args)
	{
		new Constructor_with_without_parameters();
	    new Constructor_with_without_parameters(10,5);
	}

}
