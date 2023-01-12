package FirstPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webflowpractise {

	public static void main(String[] args) {
/*System.setProperty("webdriver.chrome.driver","C:\\Users\\91934\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://book.spicejet.com");
driver.manage().window().maximize();
int countcheckboxes=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();
System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected());

driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_LTCFare")).click();
//findingmultiple elements
String discvalue="x";
List<WebElement> disc=driver.findElements(By.xpath("//div[@id'divdiscountcheckbox']/div/div/p"));
for(WebElement D:disc) {
	System.out.println(D.getText());
	if(D.getText().equals(discvalue))
	{
		
	}
}*/





		
		
		
		
		
		
		

System.setProperty("webdriver.chrome.driver","C:\\Users\\91934\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://book.spicejet.com");
int dcount=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
System.out.println(dcount);
//driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen")).click();
String discount="Unaccompanied Minor";
List<WebElement> checkbox=driver.findElements(By.xpath("//div[@)id'divdiscountcheckbox/div/div/p']"));
for(WebElement a:checkbox) {
	System.out.println(a.getText());
	if(a.getText().equals(discount))
{
		
switch(discount) {
case"Unaccompanied Minor":
{
driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_UNMR")).click();
break;

}
}



}
}











	}

}
