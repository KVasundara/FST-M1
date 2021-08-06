

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;


public class Activity7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		driver.get("http://alchemy.hguy.co/crm");
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//*[@id=\'bigbutton\']")).click();
	    driver.findElement(By.id("grouptab_0")).click();
	    driver.findElement(By.id("moduleTab_9_Leads")).click();
	    driver.manage().window().maximize();
	 
	   
	    WebDriverWait wait = new WebDriverWait(driver,50);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='adspan_1e367a61-8a0f-33f3-4e6f-5db0c113de32']/child::*")));
        WebElement AdditionalInfo=driver.findElement(By.xpath("//span[@id='adspan_1e367a61-8a0f-33f3-4e6f-5db0c113de32']/child::*"));
        AdditionalInfo.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span.phone")));
        System.out.println("Phone no details: "+driver.findElement(By.cssSelector("span.phone")).getText());
    }
		
	}


