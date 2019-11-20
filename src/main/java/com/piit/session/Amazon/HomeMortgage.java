package com.piit.session.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeMortgage {
	 WebDriver driver;
	@FindBy(id="homeval")
	WebElement homevalue;
	
	@FindBy(id="downpayment")
	WebElement dpayment;
	
	@FindBy(id="loanamt")
	WebElement loanamount;
	
	@FindBy(id="intrstsrate")
	WebElement interest;
	
	@FindBy(name="ratebutton")
	WebElement submit;
	
	
	
	
	
	public void enterhomevalue(String hmv) {
		homevalue.clear();
		homevalue.sendKeys(hmv);	
	}
	
	public void downpayment(String dpv) {
		dpayment.clear();
		dpayment.sendKeys(dpv);
	}	
	
	public void loanamount(String lm) {
		loanamount.clear();
		loanamount.sendKeys(lm);
		
	}
	
	public void intrstsrate(String ir) {
		interest.clear();
		interest.sendKeys(ir);	
	}
	
	public void submitbutton() {
		submit.click();
	}
	
   public HomeMortgage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
}
