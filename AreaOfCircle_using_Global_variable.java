package javaprograms.assignments;

public class AreaOfCircle_using_Global_variable
{

	static float pi=3.14f;
	static int r;
	
	
	public static void main(String[] args)
	{
		r=3;
		float areaofcircle = pi*r*r;
		System.out.println("Area of Circle is = "+areaofcircle);
		
	}

}
