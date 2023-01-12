package FirstPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91934\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions mouse=new Actions(driver);
		mouse.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
		mouse.moveToElement(driver.findElement(By.xpath("//a[@class='nav-link nav-item']/span"))).click().perform();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone14 pro max");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String deliveryday="Get It by Tomorrow";
		List<WebElement> Checkdeliveryday=driver.findElements(By.xpath("//div[@id='deliveryRefinements']/ul/li"));
		for(WebElement checkbox : Checkdeliveryday) {
			System.out.println(checkbox.getText());
			if(checkbox.getText().equals(deliveryday))
			{
				checkbox.click();
				break;
			}
		}
	String InternalMemory="Apple";
	List<WebElement> checkbrand=driver.findElements(By.xpath("//div[@id='brandsRefinements']/ul/li"));
				for(WebElement Memoryvalue: checkbrand) {
		System.out.println(Memoryvalue.getText());
		if(Memoryvalue.getText().equals(InternalMemory))
		{
			Memoryvalue.click();
			break;	
	}

}
	}
}

