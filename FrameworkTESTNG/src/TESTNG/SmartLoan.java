package TESTNG;

import org.testng.annotations.Test;

public class SmartLoan {
@Test(groups= {"sanity"})
public void SmartLoanweblogin()
{
	System.out.println("SmartLoan from web");
}

@Test
public void SmartLoanapplogin()
{
	System.out.println("SmartLoan from app");
}

@Test
public void SmartLoanbranchlogin()
{
	System.out.println("SmartLoan from branch");
}

}
