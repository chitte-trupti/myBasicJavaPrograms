package javaprograms.assignments;

public class Global_static_nonStatic_Variable_calling 
{
	//global variables declarations
	int a=10;    //non Static global variable 
	static char c='A';  //Static global variable

	public static void main(String[] args) 
	{
		int a=100;
		System.out.println("Value of a="+a);
		
		System.out.println("Value of c="+c);

	}

}
