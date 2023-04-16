package basicsOfJava;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x= new Scanner(System.in);
		int ch;
		System.out.println("1.Natural 2.Reverse 3.Even 4. Odd Enter your choice");
		ch=x.nextInt();
		switch(ch)
		{case 1: 
		{
		System.out.println("Print Natural Number");
		for(int i=1;i<=10;i++) //for loop with increment of 1
		{
			System.out.println(i);
		}
		}
		break;
		case 2:
		{
		System.out.println("Print Reverse Natural Numbers");
		for(int i=10;i>=1;i--) //for loop with increment of -1
		{
			System.out.println(i);
		}
		}
		break;
		case 3:
		{
		System.out.println("Print Even Numbers");
		int j=2;
		while (j<=10) //while loop with increment of 2
		{
			System.out.println(j);
			j=j+2;
		}
		}
		break;
		case 4:
		{
		System.out.println("Print Odd Numbers");
		int k=1;
		do
		{
			System.out.println(k);
			k=k+2;
		}while (k<=10);
		}
		break;
		default:
			System.out.println("Invalid choice entered");
	}
	}
}
