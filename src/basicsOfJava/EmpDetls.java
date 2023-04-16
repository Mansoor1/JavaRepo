package basicsOfJava;

import java.util.Scanner;

public class EmpDetls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		int eno=1;
		String ename="George";
		float sal=6000;
		System.out.println("Enter eno");
		eno=x.nextInt();
		System.out.println("Entere name");
		ename=x.next();
		System.out.println("Enter Salary");
		sal=x.nextFloat();
		System.out.println("eno="+eno);
		System.out.println("ename="+ename);	
		System.out.println("sal="+sal);
}

}
