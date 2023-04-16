package basicsOfJava;

import java.util.ArrayList;

public class ArrayListExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cNames = new ArrayList<String>();
		System.out.println("Array list Elements before storing data = "+cNames.size());
		cNames.add("Jack"); //0th location is stored in
		cNames.add("Riya");
		cNames.add("Taniya");
		cNames.add("John");
		System.out.println("Array list Elements after storing data = "+cNames.size());
		for (int i=0;i<cNames.size();i++)
		{
			System.out.println(cNames.get(i));
		}
		cNames.add("Josh");
		cNames.add(1, "Michael");
		System.out.println("Array list Elements after storing data = "+cNames.size());
		for (int i=0;i<cNames.size();i++)
		{
			System.out.println(cNames.get(i));
		}
		
		if(cNames.contains("Josh"))
		{
			System.out.println("Element exists");
		}
		else
		{
			System.out.println("Element does not exist");
		}
		
	}
				
	}	
