package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class returndateAssertions {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\91934\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://book.spicejet.com/");
String returndatefielddisplay=driver.findElement(By.id("marketDate_2")).getAttribute("style");
System.out.println(returndatefielddisplay);
//Assert.assertTrue(returndatefielddisplay.contains("1"));
//it will not pass
Assert.assertFalse(returndatefielddisplay.contains("1"));
//it will pass
//here expected nd result is true so nxt lines are executed
//bcoz returndatefielddisplay means value of attribute that is style and it contains 0.5
//Assert.assertFalse(returndatefielddisplay.contains("0.5"));
//it will not pass
Assert.assertTrue(returndatefielddisplay.contains("0.5"));
System.out.println("100");
System.out.println("1020");
//here,true is expected and ans is also expected so nxt lines of code is executed
//it will pass
/*here instead of id-else condition we used assertion using tesng jars
if (returndatefielddisplay.contains("1"))
{
System.out.println("Return Date field looks like Enabled");
}
else
{
System.out.println("Return Date field looks like disabled");
}*/
//example
/*int a=30;
int b=20;
int actualvalue=a+b;
int expectedvalue=52;*/
/*if(actualvalue==expectedvalue)
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}*/
int x=50;
int y=45;
int A=x-y;
int B=5;
Assert.assertEquals(A,B);
System.out.println("Testing");
/*
if(A==B)
{
	System.out.println("P");
}
else
{
	System.out.println("F");
}*/
System.out.println("qwerty");
}
}

