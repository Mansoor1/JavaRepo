package classesAndObjects;

public class StudDetails {

	int sno;
	String sname;
	public StudDetails()
	{
		System.out.println("Default Constructor invoked..");
		sno=1;
		sname="tani";
	}
	public StudDetails(int sno1,String sname1)
	{
		System.out.println("Parameterized Constructor invoked..");
		sno=sno1;
		sname=sname1;
	}
	public StudDetails(int sno1)
	{
	//	System.out.println("Default Constructor invoked..");
		sno=sno1;
		
	}
	public void dispStudDetl()
	{
		System.out.println("sno="+sno+"\t"+"sname="+sname);
		
	}
}
