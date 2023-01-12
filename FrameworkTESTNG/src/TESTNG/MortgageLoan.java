package TESTNG;

import org.testng.annotations.Test;

public class MortgageLoan {
	@Test
	public void MortgageLoanweblogin()
	{
		System.out.println("MortgageLoan from web");
	}

	@Test(enabled=false)//we use flag enabled to skip
	public void MortgageLoanapplogin()
	{
		System.out.println("MortgageLoan from app");
	}

	@Test
	public void MortgageLoanbranchlogin()
	{
		System.out.println("MortgageLoan from branch");
	}
}
