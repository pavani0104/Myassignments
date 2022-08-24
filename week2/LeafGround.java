package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args)

	{
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");

		driver.manage().window().maximize();

		driver.findElement(By.name("j_idt88:name")).sendKeys("pavani");
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys(",India");

		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();

	}

}