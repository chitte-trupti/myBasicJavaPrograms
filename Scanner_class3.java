package javaprograms.assignments;

import java.util.Scanner;

public class Scanner_class3 {
	
	 int a,b,Area_of_Rectangle;
	
	Scanner sc = new Scanner(System.in);
	
	void calculateAreaOfReactangle()
	{
		System.out.println("Enter the Length=");
		a=sc.nextInt();
		System.out.println("Enter the Breath=");
		b=sc.nextInt();
		int Area_of_Rectangle = a*b;
		System.out.println("Area of Rectangle is="+Area_of_Rectangle);
	}
	

	public static void main(String[] args) 
	{
		
		Scanner_class3 s1= new Scanner_class3();
		s1.calculateAreaOfReactangle();
		

	}

}
