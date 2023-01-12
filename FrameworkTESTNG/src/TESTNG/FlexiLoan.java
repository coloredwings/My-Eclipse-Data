package TESTNG;

import org.testng.annotations.Test;

public class FlexiLoan {
	@Test
	public void flexiloanweblogin()
	{
		System.out.println("FlexiLoan from web");
	}
	
	@Test(groups= {"sanity"})
	public void flexiloanapplogin()
	{
		System.out.println("FlexiLoan from app");
	}

	@Test
	public void flexiloanbranchlogin()
	{
		System.out.println("FlexiLoan from branch");
	}

}
