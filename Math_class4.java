package javaprograms.assignments;

public class Math_class4 
{

	public static void main(String[] args) 
	{
		double d=Math.PI;
		for(int i=1;i<=5;i++)
		{
			double r1=Math.random();
			double area_of_circle=d*r1*r1;
			System.out.println("Area of Circle="+area_of_circle);
		}

	}

}
