package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spicejet {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\91934\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://book.spicejet.com");
driver.manage().window().maximize();
Select currencydd=new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")));
System.out.println(currencydd.getFirstSelectedOption().getText());

	}
}