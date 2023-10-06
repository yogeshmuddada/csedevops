package com.lbrce.devops;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserValidationTesting {
	@Test
	public void testCase1()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("srinu","srinu@1234"));
	}
	public void testCase2()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("srinu","srinu@12345"));
	}	
	public void testCase3()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("srinu","srinu@123423"));
	}	
	public void testCase4()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(true,uv.check("lbrce","lbrce@76"));
	}	
	public void testCase5()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("srinu","yogi@1234"));
	}	

}
