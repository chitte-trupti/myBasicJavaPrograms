package javaprograms.assignments;

import java.util.Scanner;

public class Assignment36 {

	public static void main(String[] args) {
		
		int a,b;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of a&b");
		a=sc.nextInt();
		b=sc.nextInt();
		
		
		int mod=a%b;
		System.out.println("Modulous is = "+mod);
		sc.close();
		

	}

}
