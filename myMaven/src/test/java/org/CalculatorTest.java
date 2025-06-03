package org;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

	@Test
	public void testBig()
	{
	Calculator obj=new Calculator();
	Assert.assertEquals(20,obj.findBig(10, 20));
	}
	@Test
	public void testBig1()
	{
	Calculator obj=new Calculator();
	Assert.assertEquals(20,obj.findBig(10, 20));
	}
	@Test
	public void testSmall()
	{
	Calculator obj=new Calculator();
	Assert.assertEquals(10,obj.findSmall(10, 20));
	}
	@Test
	public void testMax()
	{
	Calculator obj=new Calculator();
	Assert.assertEquals(20,obj.findMax(10, 20));
	}
	}
