package classesAndObjects;

public class Chrome implements Browser {

	@Override
	public void openBrowser(String url) {
		// TODO Auto-generated method stub
		System.out.println("Open chrome browser: "+url);
	}

	@Override
	public void closeBrowser(String url) {
		// TODO Auto-generated method stub
		System.out.println("Close chrome browser: "+url);
	}

}
