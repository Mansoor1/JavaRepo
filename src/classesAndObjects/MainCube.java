package classesAndObjects;

public class MainCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube obj=new Cube();
		obj.setData();
		int res=obj.dispData();
		System.out.println("Cube="+res);
		obj.getDataFrmMain(20, 20, 20);
		res=obj.dispData();
		System.out.println("Cube="+res);
		res=obj.getDispDataFrmMain(30,30,30);
		System.out.println("Cube="+res);
		obj.demo1(); 
		//Calling Protected method 'demo1', we also call Private 'demo' too
		
		
	}

}

