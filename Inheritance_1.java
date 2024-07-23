package javaprograms.assignments;

import java.util.Scanner;

class parent
{
	static int a,b;
	static int c;
	
	
	 void add()
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a&b=");
		a=sc.nextInt();
		b=sc.nextInt();
			
	    c=a+b;
		System.out.println("Addition is = "+c);
	}
}

public class Inheritance_1 extends parent

{
	static void sub()
	{
		c=a-b;
		System.out.println("Subtraction is = "+c);
	}
	
	
	public static void main(String[] args) 
	{
		
		Inheritance_1 I = new Inheritance_1();
		I.add();
		sub();
	}

}
