package javaprograms.assignments;

import java.util.Scanner;

public class CircumfarenceOfCircle
{

	double pi =Math.PI;
	int r;
	Scanner sc = new Scanner(System.in);
	
	void calCircumfarenceOfCircle()
	{
		System.out.println("Enter the Value of r=");
		r=sc.nextInt();
		double circumfarenceOfCircle = 2*pi*r;
		System.out.println("Circumfarence of Circle is = "+circumfarenceOfCircle);
	}
	
	
	public static void main(String[] args)
	{
		CircumfarenceOfCircle c1= new CircumfarenceOfCircle();
		c1.calCircumfarenceOfCircle();
	}

}
