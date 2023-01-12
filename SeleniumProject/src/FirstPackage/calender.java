package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class calender {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\91934\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	/*Actions mouse=new Actions(driver);
mouse.moveToElement(driver.findElement(By.id("u_0_e_tH"))).perform();
String textmessage=driver.switchTo().alert().getText();
System.out.println(textmessage);
 driver.findElement(By.cssSelector("#u_0_e_IR"));
	driver.findElement(By.id("u_0_d_E8")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	System.out.println(driver.findElement(By.id("u_0_d_E8")).getText());*/

	driver.findElement(By.id("email")).sendKeys("chinnushonu1994@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Praneeth@01");
	driver.findElement(By.id("u_0_0_PF")).click();
	
		
			
	
	
	
	
	
	
	
	
	}

}

