package javaprograms.assignments;

public class Arithmatic_opr_using_global_variable {
	
	static int a=40,b=20;   //Global Variable
	

	public static void main(String[] args)
	{
		int add=a+b;
		System.out.println("Additon= "+add);
		
		int sub=a-b;
		System.out.println("Subtraction="+sub);
		
		float div=a/b;
		System.out.println("Division="+div);
		
		int mul=a*b;
		System.out.println("Multiplication="+mul);
		
		int mod=a%b;
		System.out.println("Modulous="+mod);

	}

}
