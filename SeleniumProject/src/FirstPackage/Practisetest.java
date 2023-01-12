package FirstPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practisetest {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\91934\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.airindia.in/");
Select Traveltype=new Select(driver.findElement(By.id("_classType1")));
//System.out.println(Traveltype.getFirstSelectedOption().getText());
Traveltype.selectByIndex(2);
Select discounttype=new Select(driver.findElement(By.id("concessionaryType1")));
discounttype.selectByValue("Student");
		/*Select adultpassengertype=new Select(driver.findElement(By.id("ddladult1")));
		adultpassengertype.selectByValue("4");
		Select childvalue=new Select(driver.findElement(By.id("ddlchildren1")));
		childvalue.selectByVisibleText("2");
		Select infant=new Select(driver.findElement(By.id("ddlinfants1")));
		infant.selectByIndex(1);
		String fromlocation="Belfast, Belfast City Airport, BHD, United Kingdom, GB";
				driver.findElement(By.id("from")).sendKeys("as");
				List<WebElement> Fromplace=driver.findElements(By.xpath(("//li[@class='ui-menu-item']/a")));
		              for(WebElement place:Fromplace) {
			      System.out.println(place.getText());
			      if(place.getText().equals(fromlocation))
			      {
			    	  place.click();
			    	  break;
			      }
		              }
		String Tolocation="Calgary, Calgary International Airport, YYC, Canada, CA";
		driver.findElement(By.id("to")).sendKeys("ad");
		List<WebElement> toplace=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
        for(WebElement newplace:toplace) {
	System.out.println(newplace.getText());
	if(newplace.getText().equals(Tolocation))
	{
		newplace.click();
		break;
	}
}*/
       // String departuredate="25";
        //String departuremonth="August 2023";
        //JavascriptExecutor executor = (JavascriptExecutor)driver;
//executor.executorScript("arguments[0].click();",driver.findElement(By.xpath(")))
       // driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).click();
        
        String firstheader=driver.findElement(By.xpath("//div[lass='ui-datepicker-group ui-datepicker-group-first']")).getText();
        System.out.println(firstheader);
        
        
	}
}