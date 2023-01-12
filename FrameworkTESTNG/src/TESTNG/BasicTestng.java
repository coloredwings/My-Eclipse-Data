package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTestng {
	@Test//annotation
	public void testcase1()
	{
		Assert.assertTrue(false);
		System.out.println("hi");
	}
	@Test
	public void testcase2()
	{
		Assert.assertFalse(false);
		System.out.println("welcome");
	}
	@Test
	public void testcase3()
	{
		Assert.assertTrue(true);
		System.out.println("to");
	}
	@Test
	public void testcase4()
	{
		Assert.assertFalse(true);
		System.out.println("belgium");
	}
			
}
