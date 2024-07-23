package javaprograms.assignments;

public class Nested_if_else {

	public static void main(String[] args) 
	{
		int A=10, B=50, C=90;
		
		if(A<B)
		{
			System.out.println("A is less than B");
			
			if(C>B)
			{
				System.out.println("C is greater than B");
				
				if(B>A)
				{
					System.out.println("B is greater than A");
					
					if(A>C)
					{
						System.out.println("A is greater than C");
					}
				}
			}
		}
		
		else
		{
			System.out.println("A is greater than B");
		}
		
	}

}
