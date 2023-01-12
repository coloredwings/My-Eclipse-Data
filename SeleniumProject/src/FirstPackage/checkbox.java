package FirstPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91934\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://book.spicejet.com");
		driver.manage().window().maximize();
		driver.getTitle();
		//to count how many check boxes we have=using type =checkbox which is common of all we can find count
		//we use findelement(s) here
int countcheckboxes=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
//System.out.println(countcheckboxes);
//System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected());
//driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();
//System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected());

//to list the names of all the checkbox elements in this particular group(divdiscountcheckbox)


String discountvalue="Student";
List<WebElement> discountscheckbox=driver.findElements(By.xpath("//div[@id='divdiscountcheckbox']/div/div/p"));
	
//enhancedforloop

for(WebElement singleoption : discountscheckbox)
	{
		System.out.println(singleoption.getText());
	if(singleoption.getText().equals(discountvalue))
		{
	      switch (discountvalue)
	      {
		    case"Family & Friends":
		      driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();
		      break;
		      
		    case"Sr. Citizen":
		    	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen")).click();
		    	break;
		    	
		    case"Armed Forces":
		    	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense")).click();
		    	break;
		    	
		    case"LTC Fare":
		    	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_LTCFare")).click();
		    	break;
		    	
		    case"Govt. Employee":
		    	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_GovtEmp")).click();
		    	break;
		    	
		    case"Student":
		    	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Student")).click();
		    	break;
		    	
		    case"Unaccompanied Minor":
		    	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_UNMR")).click();
		    	break;	
		    	
		    case"Healthcare Professionals":
		    	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_HealthCareProfessional")).click();
		    	break;
		    	
		         	}
	              break;
	              }
	            }
  }
}
