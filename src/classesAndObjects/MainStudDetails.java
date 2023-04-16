package classesAndObjects;

public class MainStudDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudDetails obj=new StudDetails();
		obj.dispStudDetl();
		StudDetails obj1=new StudDetails(2,"John");
		obj1.dispStudDetl();
		StudDetails obj2=new StudDetails(3);
		obj2.dispStudDetl();
	}

}
