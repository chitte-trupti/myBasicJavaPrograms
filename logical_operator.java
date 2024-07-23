package javaprograms.assignments;

public class logical_operator {

	public static void main(String[] args) {
		
		int A=10,B=40,C=20;
		
		if(A<B && B>C)
		{
			System.out.println("Both condition are true");
		}
		
		if(A>B || B>C)
		{
			System.out.println("Condition is either true or false");
		}
		
		if(!(A>B && B>C))
		{
			System.out.println("Condition is false but block is execute");
		}
		
		if(!(A<B && B>C))
		{
			System.out.println("condition is True but block is not execute");
		}
		

	}

}
