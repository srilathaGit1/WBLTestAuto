package com.wbl.tests.ui;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.base.BaseWebTest;
import com.wbl.pages.GmailHomePage;
import com.wbl.pages.SearsHomePage;

public class TestSearsHomePage extends BaseWebTest {
	
	  private SearsHomePage sh;

@BeforeClass
public void beforeClass() {
    sh = new SearsHomePage(driver);
}

@Test

public void testoutDoor() throws Exception{
	sh.clickOutDoor();
	sh.clickGasGrill();
	 String result = sh.SearsOnly();
	Assert.assertEquals(result, (78));
	System.out.println("came here");
	
}


	  
  }
  

