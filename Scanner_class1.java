package javaprograms.assignments;
import java.util.Scanner;

public class Scanner_class1 
{
	static int a,b;
	static Scanner S1=new Scanner(System.in);
	
	static void add()
		{
			System.out.println("Enter the value of a=");
			a= S1.nextInt();
			System.out.println("Enter the value of b=");
			b= S1.nextInt();
			int c=a+b;
			System.out.println("Addition is ="+c);
		}
	 void sub()
	{
		System.out.println("Enter the value of a=");
		a= S1.nextInt();
		System.out.println("Enter the value of b=");
		b= S1.nextInt();
		int c=a-b;
		System.out.println("Subtraction is ="+c);
	}
	 static void div()
		{
			System.out.println("Enter the value of a=");
			a= S1.nextInt();
			System.out.println("Enter the value of b=");
			b= S1.nextInt();
			int c=a/b;
			System.out.println("Division is ="+c);
		}
	  void mul()
		{
			System.out.println("Enter the value of a=");
			a= S1.nextInt();
			System.out.println("Enter the value of b=");
			b= S1.nextInt();
			int c=a*b;
			System.out.println("Multiplication is ="+c);
		}
	  static void mod()
		{
			System.out.println("Enter the value of a=");
			a= S1.nextInt();
			System.out.println("Enter the value of b=");
			b= S1.nextInt();
			int c=a%b;
			System.out.println("Modulous is ="+c);
		}
	public static void main(String[] args) 
	{
		
		add();
		div();
		mod();
		
		Scanner_class1 sc=new Scanner_class1();
		sc.sub();
		sc.mul();
		
	}

}
