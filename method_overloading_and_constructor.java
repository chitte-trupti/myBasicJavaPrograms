//Program for Combination of method overloading & Constructor

package javaprograms.assignments;
public class method_overloading_and_constructor
{
	
	void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println("Addition="+c);
	}
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition="+c);
	}
	method_overloading_and_constructor(int a,int b)
	{
		int c=a-b;
		System.out.println("Subtraction="+c);
	}
	method_overloading_and_constructor()
	{
		int a=50,b=20,c;
		c=a-b;
		System.out.println("Subtraction="+c);
		
	}
	public static void main(String[] args) 
	{
		new method_overloading_and_constructor();
		new method_overloading_and_constructor(30,20);
		method_overloading_and_constructor c1=new method_overloading_and_constructor();
		c1.add();
		c1.add(5,2);
	}

}
