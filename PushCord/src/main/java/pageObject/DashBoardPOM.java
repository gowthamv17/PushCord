package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pushCordPurchase.FunctionalMethod;

public class DashBoardPOM {


	public DashBoardPOM() {
		
		PageFactory.initElements(FunctionalMethod.driver, this);
	}
	
	@FindBy(xpath="//span[@class='dashboard-menu-icon show-tooltip commonIcon']")
	private WebElement dashboard;
	
	public WebElement getPosoption() {
		return posoption;
	}


	@FindBy(xpath="//div[text()='POS']")
	private WebElement posoption;

	@FindBy(xpath="//span[text()='No']")
	private WebElement noOption;
	
	@FindBy(xpath="//input[contains(@data-placeholder,'Bar Code')]")
	private WebElement barCode;
	
	@FindBy(xpath="//span[text()=' Complete ']")
	private WebElement complete;
	
	
	public void dashboard() {
		this.dashboard.click();
	}
	
	public void pos() {
		this.posoption.click();
	}
	
	public void validateOption() {
		this.noOption.click();
	}
	
	public void barCode(String barcodedigits) throws InterruptedException {
		//this.barCode.click();
		FunctionalMethod.staticWait();
		this.barCode.sendKeys(barcodedigits);
	}
	
	public void complete() {
		this.complete.click();
	}
	
	
}
