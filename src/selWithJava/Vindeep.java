package selWithJava;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Vindeep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ArrayList<String> exp_data=new ArrayList<String>();
		exp_data.add("Days");
		exp_data.add("Months");
		exp_data.add("Years");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vindeep.com/Calculators/FDCalc.aspx");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("Title="+title);
		if(title.equals("Fixed Deposit Calculator | Calculate FD Interest, Maturity value"))
		{
			System.out.println("Title matched...");
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FDAmount")).clear();
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FDAmount")).sendKeys("200000");
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period")).clear();
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period")).sendKeys("70");
			//FD Period dropdown code
			WebElement ele=driver.findElement(By.id("ContentPlaceHolder1_cphCentre_PeriodDropDown"));
			Select allOpts=new Select(ele);
			allOpts.selectByVisibleText("Days");
			//count no. of items in a dropdownbox
			List<WebElement> allItems=allOpts.getOptions();
			System.out.println("total number of items="+allItems.size());
			//fetch items and display
			for(int i=0;i<allItems.size();i++)
			{
				System.out.println(allItems.get(i).getText());
				if(exp_data.get(i).equals(allItems.get(i).getText()))
				{
				System.out.println("Item Matched..");	
				}
				else
				{
				System.out.println("Item not Matched..");
				}
			}
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_InterestRate")).clear();
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_InterestRate")).sendKeys("5.40");
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_btnFDMAmount")).click();
			Thread.sleep(5000);
			//fetch FD maturity amount
			String fd_amount=driver.findElement(By.name("ctl00$ContentPlaceHolder1$cphCentre$MaturityAmountTextBox")).getAttribute("value");
			System.out.println("FD Maturity Amount="+fd_amount);
		}
		else
		{
			System.out.println("Title not matched...");
		}
		driver.quit();
		
	}

}
