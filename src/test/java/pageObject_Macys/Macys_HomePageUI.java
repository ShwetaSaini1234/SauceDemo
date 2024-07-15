package pageObject_Macys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Macys_HomePageUI {
	
	
	private WebDriver webDriver;
	
	private By cLogo= By.xpath("//a[@class='logo']");
	//private By saleMarkdown= By.xpath("//a[contains(@href, '/shop/sale/clearance-closeout/Special_offers/Offer%20code%20SPLASH?id=54698&cm_re=')]");
	
	private By saleMarkdown= By.xpath("//area[@alt=\"Today's Top Deals - 25-40% Off Men's Swim\"]");
	
	

	
	
	public Macys_HomePageUI(WebDriver driver) {
	super();
	this.webDriver= driver;
	
	}
	
	public WebElement companyLogo() {
		
		WebElement logo= webDriver.findElement(cLogo);
		return logo;
		
	}
	
	public void summerSaleMarkdown() {
		
		webDriver.findElement(saleMarkdown).click();
		
	}
	
	public void verifyLandingPage() {
		String pageTitle = webDriver.getTitle();
		System.out.println("landing Page Title:"+ pageTitle);
		
	}


	
	 

}

