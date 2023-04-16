package classesAndObjects;

public class Cube {
int l,b,h;

public void setData()
{
	l=10; 
	b=10;
	h=10;
}
public int dispData()
{
	//System.out.println("Cube="+l*b*h);
	return(l*b*h);
}
public void getDataFrmMain(int x,int y,int z)
{
	l=x;
	b=y;
	h=z;
}
public int getDispDataFrmMain(int x,int y,int z)
{
	l=x;
	b=y;
	h=z;
	return(l*b*h);
}
private void demo()
{
	System.out.println("this is private method");
}
protected void demo1()
{
	System.out.println("This is protected method");
	demo(); //Private method being called here 
}

}
