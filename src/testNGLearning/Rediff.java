package testNGLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Rediff {
	WebDriver driver;
	@Test(priority=1,description="Launch")
	public void openBrowser()
	{
		System.out.println("Launch Rediff..");
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=2,description="Hard Assert",enabled=true)
	public void login() throws InterruptedException
	{
		System.out.println("Login Rediff");
		driver.findElement(By.linkText("Sign in")).click();
		String title=driver.getTitle();
		Assert.assertEquals(title, "Rediffmail");//if this Hard assert is pass it continues further execution else not
		System.out.println("Assert Executed");
		driver.findElement(By.id("login1")).sendKeys("m.arpana1234");
		driver.findElement(By.id("password")).sendKeys("arpana123");
		driver.findElement(By.id("remember")).click();
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		
	}
	@Test(priority=2,description="Soft Assert",enabled=false)
	public void login1() throws InterruptedException
	{
		SoftAssert assertion=new SoftAssert();
		
		System.out.println("Login Rediff");
		driver.findElement(By.linkText("Sign in")).click();
		String title=driver.getTitle();
		assertion.assertEquals(title, "Rediffmail123");//if this soft assert is pass or fail still it continues further execution
		System.out.println("Assert Executed");
		driver.findElement(By.id("login1")).sendKeys("m.arpana1234");
		driver.findElement(By.id("password")).sendKeys("arpana123");
		driver.findElement(By.id("remember")).click();
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		assertion.assertAll();
		
	}
	@Test(priority=3,description="Logout")
	public void closeBrowser()
	{
		System.out.println("Close Rediff..");
		driver.quit();
	}
}
