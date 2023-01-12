package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class practise {
static WebDriver driver;

public void loginpage(String username, String Password)
{
	driver.findElement(By.id("ap_email")).sendKeys(username);
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys(Password);
	driver.findElement(By.id("signInSubmit")).click();
	String Actualmessage=driver.findElement(By.xpath("//*[@class='a-alert-heading']")).getText();
	System.out.println(Actualmessage);
	String Expectedmessage="Incorrect phone number";
	System.out.println(Actualmessage.equals(Expectedmessage));
	driver.findElement(By.id("ap_email")).clear();
	driver.findElement(By.xpath("//*[@id='ap_password']")).clear();

	driver.close();

}

	public static void main(String[] args) {
        //ChromeDriver driver=new ChromeDriver();
        //takes all methods of chromedriver and remote web driver
		//first set system property then obj should be created
		//webdriver is a interface
System.setProperty("webdriver.chrome.driver","C:\\Users\\91934\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//webdriver.chrome.driver is key
		//path is given where drivers of browser are placed.
driver=new ChromeDriver();
        //takes methods from WebDriver class
		//should gv location of the chromedriver
		//get is a method of object 'driver' in chrome browser
driver.get("https://www.amazon.com");
		/*System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getClass());*/
driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		//driver.findElement(By.class("//span[contains(@class,'nav-action-inner')]")).click();
//driver.findElement(By.name("email")).sendKeys("0467805886");
        //driver.findElement(By.xpath("//input[@type='email']")).sendKeys("yellankishravanthi@gmail.com");
        //driver.findElement(By.cssSelector("#ap_email")).sendKeys("Testing");
        //driver.findElement(By.id("ap_email")).sendKeys("1234567851");
/*driver.findElement(By.id("continue")).click();
driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("Dad#101220");
driver.findElement(By.id("signInSubmit")).click();
String Actualmessage=driver.findElement(By.xpath("//*[@class='a-alert-heading']")).getText();
System.out.println(Actualmessage);
String Expectedmessage="Incorrect phone number";
System.out.println(Actualmessage.equals(Expectedmessage));
driver.close();*/
practise object=new practise();
//object.loginpage("0467805886","Dad#101220");
		}
	}

