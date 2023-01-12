package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {
static String adultvalue="3";
static String childvalue="2";
static String infantvalue="3";

	public static void main(String[] args) {
		// if u find dropdown with TAGNAME SELECT,Selenium has a class to identify element.
		//we create object for the select class
		//if there is no tagname select,we cnt use select method for dropdown.
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\91934\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();	
driver.get("https://book.spicejet.com");	
driver.manage().window().maximize();
Select currencydropdown=new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")));
System.out.println(currencydropdown.getFirstSelectedOption().getText());
//currencydropdown.selectByValue("EUR");
//currencydropdown.selectByIndex(5);
currencydropdown.selectByVisibleText("MYR");
System.out.println(currencydropdown.getFirstSelectedOption().getText());
driver.findElement(By.id("divpaxinfo")).click();
Select Passdropdown=new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
//Passdropdown.selectByValue("6");
Passdropdown.selectByValue(adultvalue);
//Passdropdown.selectByIndex(2);
System.out.println(Passdropdown.getFirstSelectedOption().getText());
Select childdropdown=new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD")));
//childdropdown.selectByIndex(2);
childdropdown.selectByValue(childvalue);
System.out.println(childdropdown.getFirstSelectedOption().getText());
Select infantdd=new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT")));
infantdd.selectByValue(infantvalue);


//infantdd.selectByIndex(1);
System.out.println(infantdd.getFirstSelectedOption().getText());
String Actualvalue=driver.findElement(By.id("divpaxinfo")).getText();
System.out.println(Actualvalue);
String Expectedvalue=(adultvalue+"Adult"+","+childvalue+"Child"+","+infantvalue+"Infant");
System.out.println(Actualvalue.equals(Expectedvalue));






//driver.close();
	}

}
