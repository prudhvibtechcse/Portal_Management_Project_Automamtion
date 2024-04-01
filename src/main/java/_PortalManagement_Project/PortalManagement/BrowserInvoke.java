package _PortalManagement_Project.PortalManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserInvoke
{
	
	public static void InvokeBrowser()
	{
		WebDriver d=WebDriverManager.chromedriver().create();
		d.get("https://client02-fundmgmt.coop.test.360incentives.io/");
		d.manage().window().maximize();
		
		String title=d.getTitle();
		
		System.out.println(title);

		d.findElement(By.id("loginName")).sendKeys("Bank_user");
		//d.findElement(By.cssSelector("#loginName")).sendKeys("Bank_user");
		d.findElement(By.name("loginPassword")).sendKeys("Fall2020#");
		//d.findElement(By.cssSelector("[name='loginPassword']")).sendKeys("Fall2020#");
		d.findElement(By.xpath("(//Button[@class='blueButton_submit text-right margin_right_0px ng-binding'])[1]")).click();
		//d.findElement(By.cssSelector("[class='blueButton_submit text-right margin_right_0px ng-binding']")).click();
		d.quit();
		//new pull request
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		BrowserInvoke a= new BrowserInvoke();
		BrowserInvoke.InvokeBrowser();
		
	}

}
