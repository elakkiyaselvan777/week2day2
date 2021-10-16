package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
    	Thread.sleep(2000);
		driver.get("http://leaftaps.com/opentaps/");
		Thread.sleep(2000);
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("Demosalesmanager");
		Thread.sleep(2000);
		WebElement Password = driver.findElement(By.name("PASSWORD"));
		Password.sendKeys("crmsfa");
		Thread.sleep(2000);
		WebElement LoginSubmit = driver.findElement(By.className("decorativeSubmit"));
		LoginSubmit.click();
		
		WebElement CRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		CRMSFA.click();
		
		WebElement Leads = driver.findElement(By.linkText("Leads"));
		Leads.click();
		
		WebElement CreateLead = driver.findElement(By.linkText("Create Lead"));
		CreateLead.click();
		
		WebElement CompanyName = driver.findElement(By.id("createLeadForm_companyName"));
        CompanyName.sendKeys("Pyraworkz");
        
        WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
        FirstName.sendKeys("Elakkyaselvan");
        
        WebElement LastName = driver.findElement(By.id("createLeadForm_lastName"));
        LastName.sendKeys("Devarajan");
        
        WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select dropDown = new Select (source);
        dropDown.selectByVisibleText("Partner");
        
        WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
        Select dropDown1 = new Select (industry);
        dropDown1.selectByIndex(7);
        
        WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select dropDown2 = new Select (marketing);
        dropDown2.selectByValue("CATRQ_AUTOMOBILE");
        
        WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        ownership.sendKeys("Partnership");
        


	}

}
