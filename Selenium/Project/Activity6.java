import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
			
			
			driver.get("http://alchemy.hguy.co/crm");
			
			driver.findElement(By.id("user_name")).sendKeys("admin");
			driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
			driver.findElement(By.xpath("//*[@id=\'bigbutton\']")).click();
			driver.findElement(By.id("toolbar"));
			WebElement actual = driver.findElement(By.id("grouptab_3"));
			String expected = actual.getText();
			System.out.println(expected);
			Assert.assertEquals(expected, "ACTIVITIES");
			driver.close();
			
			
		

	}

}
