package javaprograms.assignments;

public class default_value_global_datatype {
	
	static int a;
	static char c;
	static byte b;
	static double d;
	static boolean bl;
	static String s;
	static short st;
	static float f;
	static long l;
	
	default_value_global_datatype()
	{
		System.out.println("Default value of integer="+a);
		System.out.println("Default value of character="+c);
		System.out.println("Default value of byte="+b);
		System.out.println("Default value of double="+d);
		System.out.println("Default value of String="+s);
		System.out.println("Default value of Boolean="+bl);
		System.out.println("Default value of short="+st);
		System.out.println("Default value of float="+f);
		System.out.println("Default value of long="+l);
	}
	

	public static void main(String[] args)
	{
		new default_value_global_datatype();
	}

}
