package FirstPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SPECIALDD {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91934\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String fromplace="facebook messenger";
		driver.findElement(By.xpath("input[@class='gLFyf']")).sendKeys("faceb");
		//Thread.sleep(5000);
		List<WebElement> data=driver.findElements(By.xpath("div[@class='pcTkSc']"));
		
		for(WebElement place:data)
		{
			System.out.println(place.getText());
			if(place.getText().equals(fromplace))
			{
			place.click();
			break;
		}
	}
	}
}
