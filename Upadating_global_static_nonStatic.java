package javaprograms.assignments;

public class Upadating_global_static_nonStatic 
{   
	
		int a=10;    //non Static global variable 
		static char c='A';  //Static global variable

		public static void main(String[] args) 
		{
			int a=100;       //updating non static global variable
			System.out.println("Value of a="+a);
			
			c='B';          //Updating static global variable
			System.out.println("Value of c="+c);

		}
}