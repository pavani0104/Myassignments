package week2;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		WebElement elementuser = driver.findElement(By.id("username"));

		elementuser.sendKeys("Demosalesmanager");

		WebElement elementpassword = driver.findElement(By.id("password"));

		elementpassword.sendKeys("crmsfa");

		WebElement elementlogin = driver.findElement(By.className("decorativeSubmit"));

		elementlogin.click();

		WebElement elementcrmsfa = driver.findElement(By.linkText("CRM/SFA"));

		elementcrmsfa.click();

		WebElement elementLeads = driver.findElement(By.xpath("//a[text()='Leads']"));

		elementLeads.click();

		WebElement elementfind = driver.findElement(By.xpath("//a[text()='Find Leads']"));

		elementfind.click();

		WebElement firstname = driver.findElement(By.xpath("(//input[@name='lastName'])[3]"));
		firstname.sendKeys("chidurala");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	

		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		String title="View Lead";
		
		String title2=driver.getTitle();
		
		if(title.equalsIgnoreCase(title2))
		{
			System.out.println("title matches");
		}
		

	}

}
