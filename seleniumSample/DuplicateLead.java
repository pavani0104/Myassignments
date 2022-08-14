package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead 
{
public static void main(String[] args)

{

	WebDriverManager.chromedriver().setup();
	
ChromeDriver driver=new ChromeDriver();

driver.get("http://leaftaps.com/opentaps/control/login");

driver.manage().window().maximize();

WebElement elementuser=driver.findElement(By.id("username"));

elementuser.sendKeys("Demosalesmanager");

WebElement elementpassword=driver.findElement(By.id("password"));

elementpassword.sendKeys("crmsfa");

WebElement elementlogin=driver.findElement(By.className("decorativeSubmit"));

elementlogin.click();

WebElement elementcrmsfa=driver.findElement(By.linkText("CRM/SFA"));

elementcrmsfa.click();

WebElement elementLeads = driver.findElement(By.linkText("Leads"));
elementLeads.click();
	
WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
elementCreateLead.click();

WebElement elementcompanyname=driver.findElement(By.id("createLeadForm_companyName"));
elementcompanyname.sendKeys("Wipro");


WebElement elementfirstname=driver.findElement(By.id("createLeadForm_firstName"));
elementfirstname.sendKeys("Pavani");


WebElement elementlastname=driver.findElement(By.id("createLeadForm_lastName"));
elementlastname.sendKeys("Chidurala");

WebElement elementDepartment =driver.findElement(By.id("createLeadForm_departmentName"));
elementDepartment.sendKeys("IT");

WebElement elementDescription =driver.findElement(By.id("createLeadForm_description"));
elementDescription.sendKeys(" New Project");

WebElement elementEmail =driver.findElement(By.id("createLeadForm_primaryEmail"));
elementEmail.sendKeys("sample001@gmail.com");

WebElement elementProvince =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select provinceName = new Select(elementProvince);
provinceName.selectByIndex(38);

WebElement elementSubmitbutton = driver.findElement(By.name("submitButton"));
elementSubmitbutton.click();

System.out.println(driver.getTitle());

WebElement elementduplicate=driver.findElement(By.linkText("Duplicate Lead"));

elementduplicate.click();

WebElement elementcompany=driver.findElement(By.id("createLeadForm_companyName"));
elementcompany.clear();

WebElement elementnewcompanyname=driver.findElement(By.id("createLeadForm_companyName"));
elementnewcompanyname.sendKeys("Amazon");

WebElement elementdupfirst=driver.findElement(By.id("createLeadForm_firstName"));
elementdupfirst.clear();

WebElement elementnewfirstname=driver.findElement(By.id("createLeadForm_firstName"));
elementnewfirstname.sendKeys("Bala");

WebElement elementduplast=driver.findElement(By.id("createLeadForm_lastName"));
elementduplast.clear();

WebElement elementnewlastname=driver.findElement(By.id("createLeadForm_lastName"));
elementnewlastname.sendKeys("puppala");
WebElement elementSubmitbutton1 = driver.findElement(By.name("submitButton"));
elementSubmitbutton1.click();



	
	



	
	
	
	
}

}