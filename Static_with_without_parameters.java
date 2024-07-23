package javaprograms.assignments;

public class Static_with_without_parameters {
	
	
	static void add(int a, int b)    //with parameters
	{
		int add=a+b;
		System.out.println("Addition ="+add);
	}
	
	static void sub()              //without parameters
	{
		int a=40,b=10,sub=0;
		sub=a-b;
		System.out.println("Subtraction="+sub);
		
	}

	public static void main(String[] args) 
	{
		add(20,50);
		sub();

	}

}
