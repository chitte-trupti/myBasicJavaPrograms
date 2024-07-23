package javaprograms.assignments;

public class four_if_else_block {

	public static void main(String[] args)
	{
		int A=10,B=30,C=50,D=60;
		
		if(A>D)
		{
			System.out.println("A is less than D");
		}
		else if(B<A)
		{
			System.out.println("B is greter than A");
		}
		
		else if(B>C)
		{
			System.out.println("B is Less than C");
			
		}
		
		else if(C<D)
		{
			System.out.println("C is less than D");
		}
		
		else if(C>A)
		{
			System.out.println("C is greter than A");
		}
		
	}

}