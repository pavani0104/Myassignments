package week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook

{
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get(" https://en-gb.facebook.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//div[@class='_6ltg'][2]/a[@role='button']")).click();

		driver.findElement(By.name("firstname")).sendKeys("devi");

		driver.findElement(By.name("lastname")).sendKeys("chidurala");

		driver.findElement(By.name("reg_email__")).sendKeys("+6581318539");

		driver.findElement(By.name("reg_passwd__")).sendKeys("user@123");

		WebElement findday = driver.findElement((By.id("day")));

		Select daydd = new Select(findday);

		daydd.selectByIndex(0);

		WebElement findmonth = driver.findElement(By.id("month"));

		Select monthdd = new Select(findmonth);

		monthdd.selectByVisibleText("Apr");

		WebElement findyear = driver.findElement(By.id("year"));

		Select yeardd = new Select(findyear);

		yeardd.selectByValue("1986");

		driver.findElement(By.className("_58mt")).click();

		driver.findElement(By.name("websubmit")).click();

	}
}
