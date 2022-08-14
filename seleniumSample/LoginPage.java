package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage 

{
public static void main(String[] args) 
{
//to add the driver to the code
	WebDriverManager.chromedriver().setup();
	//to open a browser
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/");
driver.manage().window().maximize();
WebElement elementusername = driver.findElement(By.id("username"));

elementusername.sendKeys("demosalesmanager");

WebElement elementpassword=driver.findElement(By.name("PASSWORD"));

elementpassword.sendKeys("crmsfa");

WebElement elementlogin=driver.findElement(By.className("decorativeSubmit"));

elementlogin.click();
WebElement elementWelcomeMessage=driver.findElement(By.tagName("h2"));

String text=elementWelcomeMessage.getText();

System.out.println(text);


WebElement elementCRMSFA=driver.findElement(By.linkText("CRM/SFA"));

elementCRMSFA.click();


WebElement elementLead=driver.findElement(By.linkText("Leads"));

elementLead.click();

WebElement elementcreateLead=driver.findElement(By.linkText("Create Lead"));

elementcreateLead.click();

WebElement elementcompanyname=driver.findElement(By.id("createLeadForm_companyName"));

elementcompanyname.sendKeys("TestLeaf");


WebElement elementfirstname=driver.findElement(By.id("createLeadForm_firstName"));

elementfirstname.sendKeys("Testfirst");

WebElement elementlastname=driver.findElement(By.id("createLeadForm_lastName"));

elementlastname.sendKeys("TestLast");

WebElement elementdept=driver.findElement(By.id("createLeadForm_departmentName"));
elementdept.sendKeys("Test");

WebElement elementdesc=driver.findElement(By.id("createLeadForm_description"));
elementdesc.sendKeys("Test purpose");

WebElement Elementemail = driver.findElement(By.id("createLeadForm_primaryEmail"));

Elementemail.sendKeys("testmail@google.com");

WebElement elementdd1=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

Select states=new Select(elementdd1);

states.selectByVisibleText("New York");
WebElement elementcreatelead=driver.findElement(By.className("smallSubmit"));

elementcreatelead.click();

System.out.println("the result seen on the page is " +driver.getTitle());










//driver.close();

}
}
