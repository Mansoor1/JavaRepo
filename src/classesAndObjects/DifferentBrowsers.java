package classesAndObjects;

public class DifferentBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser objFF=new Firefox();
		objFF.openBrowser("https://www.google.com/");
		objFF.closeBrowser("https://www.google.com/");
		Browser objChr=new Chrome();
		objChr.openBrowser("https://www.google.com/");
		objChr.closeBrowser("https://www.google.com/");
	}

}
