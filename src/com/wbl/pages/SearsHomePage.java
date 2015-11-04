package com.wbl.pages;

import java.util.ArrayList;
import java.util.Collection;

import com.wbl.base.BasePage;
import com.wbl.utils.web.HtmlElement;
import com.wbl.utils.web.PageDriver;

public class SearsHomePage extends BasePage {
	
	public SearsHomePage(PageDriver driver){
		super(driver);
		   _logger.debug("Open Home Page");
		   
	}
		   public void clickOutDoor() throws Exception{
			HtmlElement element = driver.findElement("link=sears.outdoor");
			element.click();
		    driver.implicitWait();
		    
		   
			   
		   }
		   
		   public void clickGasGrill() throws Exception{
			   HtmlElement element1 = driver.findElement("link=sears.gasGrills"); 
			    element1.click();
			    driver.implicitWait();
			    Thread.sleep(5000);
				
			        
			   
		   }
	
	      public String  SearsOnly() throws Exception{
	    	  ArrayList <HtmlElement> element2 = (ArrayList<HtmlElement>) driver.findElements("css=sears.searsOnly");
	    	   String  element3 =  element2.get(1).getText();
	    	  driver.implicitWait();
			   Thread.sleep(5000);
			return element3;
				
	      }
	}


