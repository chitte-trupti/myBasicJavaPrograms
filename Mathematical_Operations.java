package javaprograms.assignments;
public class Mathematical_Operations
{
	void add(int a,int b)
	{
		int Add=a+b;
		System.out.println("Addition is="+Add);
	}
	
	void Sub(int a,int b)
	{
		int Sub=a-b;
		System.out.println("Subtraction is="+Sub);
	}
	
	void Div(int a,int b)
	{
		int Div=a/b;
		System.out.println("Division is="+Div);
	}
	
	void Mul(int a,int b)
	{
		int Mul=a*b;
		System.out.println("Multiplication is="+Mul);
	}
	
	public static void main(String[] args) 
	{
		Mathematical_Operations M1=new Mathematical_Operations();
		M1.add(10,20);
		M1.Sub(20,10);
		M1.Mul(20,3);
		M1.Div(40,2);
		
	}

}
