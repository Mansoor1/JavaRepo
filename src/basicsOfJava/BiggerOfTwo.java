package basicsOfJava;

import java.util.Scanner;

public class BiggerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter First Number");
		a=x.nextInt();
		System.out.println("Enter Second Number");
		b=x.nextInt();

		if (a>=b)
		{
			if(a==b)
			{
				System.out.println("Both are equal..");
			}
			else
			{
				System.out.println(a+" is greater than "+b);	
			}
		}	
		else 
			{
				System.out.println(b+" is greater than "+a);
			}
		}
}
