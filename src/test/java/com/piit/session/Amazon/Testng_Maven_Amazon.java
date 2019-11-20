package com.piit.session.Amazon;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Testng_Maven_Amazon {
	public WebDriver driver;
  
@Test
  public void f() throws InterruptedException {
	
	  HomeMortgage morcal= new HomeMortgage(driver);
	  
	  morcal.enterhomevalue("50000");
	  morcal.downpayment("2000");
	  morcal.loanamount("58895");
	  morcal.intrstsrate("4");
	  morcal.submitbutton();
	  
	  System.out.println("checking github");
	  
  }
  
  @BeforeClass
  public void beforeClass() {

	  System.setProperty("webdriver.chrome.driver", "C:\\System Software\\Ankur Second Session Chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.mortgagecalculator.org/");
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

}
