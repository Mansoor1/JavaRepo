package classesAndObjects;

public class MainLapTop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop obj=new Laptop();
		float price=obj.getLapTopPrice();
		obj.demo();
		System.out.println("Laptop price="+price);
		HP objHP=new HP();
		objHP.demo();
		objHP.getLapTopPrice();
		objHP.demo(30);
	}

}

