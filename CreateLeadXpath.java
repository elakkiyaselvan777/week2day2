package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
    	Thread.sleep(2000);
		driver.get("http://leaftaps.com/opentaps/");
		Thread.sleep(2000);
		WebElement UserName = driver.findElement(By.xpath("(//input[@class='inputLogin'])[1]"));
		UserName.sendKeys("Demosalesmanager");
		Thread.sleep(2000);
		WebElement Password = driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]"));
		Password.sendKeys("crmsfa");
		Thread.sleep(2000);
		WebElement LoginSubmit = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		LoginSubmit.click();
		
		WebElement CRMSFA = driver.findElement(By.xpath("//a[contains(text(),'CRM')]"));
		CRMSFA.click();
		
		WebElement Leads = driver.findElement(By.xpath("//a[text()='Leads']"));
		Leads.click();
		
		WebElement CreateLead = driver.findElement(By.xpath("//a[text()='Create Lead']"));
		CreateLead.click();
		
		WebElement CompanyName = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
        CompanyName.sendKeys("Pyraworkz");
        
        WebElement FirstName = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
        FirstName.sendKeys("Elakkyaselvan");
        
        WebElement LastName = driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
        LastName.sendKeys("Devarajan");
        
        WebElement SubmitCreateLead = driver.findElement(By.xpath("//input[@class='smallSubmit']"));
        SubmitCreateLead.click();


	}

}
