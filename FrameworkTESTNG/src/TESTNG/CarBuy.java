package TESTNG;

import org.testng.annotations.Test;

public class CarBuy {
	@Test(groups= {"sanity"})
	public void CarBuyweblogin()
	{
		System.out.println("CarBuy from web");
	}

	@Test
	public void CarBuyapplogin()
	{
		System.out.println("CarBuy from app");
	}

	@Test(groups= {"sanity"})
	public void CarBuybranchlogin()
	{
		System.out.println("CarBuy from branch");
	}
}
