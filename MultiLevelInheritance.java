package javaprograms.assignments;

import java.util.Scanner;

class parent1
{
	static int a,b;
	static int c;
	static void add()
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a&b=");
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
			
	    c=a+b;
		System.out.println("Addition is = "+c);
	}
}
class parent2 extends parent1
{
	void sub()
	{ 
		c=a-b;
		System.out.println("Subtraction is = "+c);
	}
}
public class MultiLevelInheritance extends parent2

{
	static void mul()
	{
		c=a*b;
		System.out.println("Multiplication is = "+c);
	}
	
	
	public static void main(String[] args) 
	{
		
		MultiLevelInheritance I = new MultiLevelInheritance();
		add();
		I.sub();
		mul();
	}

}

 

	

