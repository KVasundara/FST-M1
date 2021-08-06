

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		driver.get("http://alchemy.hguy.co/crm");
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//*[@id=\'bigbutton\']")).click();
	    driver.findElement(By.id("grouptab_0")).click();
	    driver.findElement(By.id("moduleTab_9_Accounts")).click();
	  
	    WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table [@class='list view table-responsive']")));
		//table [@class='list view table-responsive']/tbody/tr[2]
		int n=9;
		for (int i = 1; i <= n; i++) {
			   if (i % 2 != 0) {
				
				WebElement tableRow=driver.findElement(By.xpath("//table [@class='list view table-responsive']/tbody/tr["+i+"]/td[@type='name']"));
				String rowName=tableRow.getText();
				System.out.println("Name from "+i+" row is "+rowName);
//				System.out.println("Iteration is :"+i);
			   }
			}
		
	  }
	  }
	


