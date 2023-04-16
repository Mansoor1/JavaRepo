package classesAndObjects;

public class Firefox implements Browser{

	@Override
	public void openBrowser(String url) {
		// TODO Auto-generated method stub
		System.out.println("Open firefox browser: "+url);
		
	}

	@Override
	public void closeBrowser(String url) {
		// TODO Auto-generated method stub
		System.out.println("Close firefox browser: "+url);
		
	}

		
}
