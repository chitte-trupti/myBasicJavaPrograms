package javaprograms.assignments;

import java.util.Scanner;

public class Scanner_class2
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of integer=");
		int a = sc.nextInt(10);
		int c1=a+0;
		System.out.println("Add="+c1);
		
		System.out.println("Enter the value of Byte=");
		byte bt = sc.nextByte();
		System.out.println(bt);
		
		System.out.println("Enter the value of Double=");
		double d = sc.nextDouble();
		System.out.println(d);
		
		System.out.println("Enter the value of Character=");
		char c = sc.next().charAt(0);
		System.out.println(c);
		
		System.out.println("Enter the value of Short=");
		short s = sc.nextShort();
		System.out.println(s);
		
		System.out.println("Enter the value of Long=");
		long l = sc.nextLong();
		System.out.println(l);
		
		System.out.println("Enter the value of Float=");
		float f = sc.nextFloat();
		System.out.println(f);
		
		System.out.println("Enter the value of String=");
		String st = sc.next();
		System.out.println(st);
		
		
		
		
		
		
	}

}
