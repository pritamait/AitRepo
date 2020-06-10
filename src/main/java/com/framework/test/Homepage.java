package com.framework.test;

import org.testng.annotations.Test;

import com.framework.exceptions.DriverNotInitializedException;
import com.framework.page.BasePage;

public class Homepage extends BaseTest {
	
	@Test 
	
  public void m1 () throws DriverNotInitializedException { 
		
		BasePage B =new BasePage (driver);
		
	  
  }

}
