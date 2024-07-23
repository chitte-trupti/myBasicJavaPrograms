package javaprograms.assignments;

public class non_static_inside_main
{

	void add(int a,int b)
	{
		int add=a+b;
		System.out.println("Addition="+add);
	}
	void sub(int a,int b)
	{
		int sub=a-b;
		System.out.println("Subtraction="+sub);
	}
	public static void main(String[] args)
	{
		
		non_static_inside_main NS= new non_static_inside_main();
		NS.add(10,30);
		NS.sub(30,10);
	}

}
