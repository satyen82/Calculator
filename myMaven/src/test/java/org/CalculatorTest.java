package org;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CalculatorTest {

	@Test
	public void testBig()
	{
	Calculator obj=new Calculator();
	Assert.assertEquals(20,obj.findBig(10, 20));
	Reporter.log("Big Number found successfully",true);
	}
	@Test
	public void testBig1()
	{
	Calculator obj=new Calculator();
	Assert.assertEquals(20,obj.findBig(10, 20));
	Reporter.log("Big Number found successfully",true);
	}
	@Test
	public void testSmall()
	{
	Calculator obj=new Calculator();
	Assert.assertEquals(10,obj.findSmall(10, 20));
	Reporter.log("Small Number found successfully",true);
	}
	@Test
	public void testMax()
	{
	Calculator obj=new Calculator();
	Assert.assertEquals(20,obj.findMax(10, 20));
	Reporter.log("Max Number found successfully",true);
	}
	
	@Test
	public void testEqual()
	{
	Calculator obj=new Calculator();
	Assert.assertEquals(true,obj.findEqual(20, 20));
	Reporter.log("Number1 equals number2",true);
	}
	
	}
