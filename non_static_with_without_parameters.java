package javaprograms.assignments;

public class non_static_with_without_parameters
{

	 void add(int a, int b)    //with parameters
	{
		int add=a+b;
		System.out.println("Addition ="+add);
	}
	
	 void sub()              //without parameters
	{
		int a=40,b=10,sub=0;
		sub=a-b;
		System.out.println("Subtraction="+sub);
		
	}

	public static void main(String[] args) 
	{
		non_static_with_without_parameters N1=new non_static_with_without_parameters();
	    N1.add(20,50);
		N1.sub();

	}

}

	
	


