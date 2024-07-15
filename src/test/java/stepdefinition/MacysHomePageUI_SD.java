package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import browserlaunch.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject_Macys.Macys_HomePageUI;

public class MacysHomePageUI_SD {
	
	Macys_HomePageUI macys_HomePageUI = new Macys_HomePageUI (Driverfactory.getDriver());
	
	private int actualX=20;
	private int actualY=59;
	
	
	
	@Given("Macy User launch the page")
	public void macy_user_launch_the_page() {
	 
	Driverfactory.getDriver().get("https://www.macys.com");
	
	}

	@When("Macy User check company logo position on the left side of the page")
	public void macy_user_check_company_logo_position_on_the_left_side_of_the_page() {
		
		int expectedX=20;
		int expectedY=59;
		
		WebElement logo=macys_HomePageUI.companyLogo();
		Point location = logo.getLocation();
		
		  int actualX = location.getX();
		  System.out.println("actualX cordinated:" + actualX);
		  
		  int actualY = location.getY();
		  System.out.println("actualY cordinated:" + actualY);
		  
		  if (actualX == expectedX && actualY == expectedY) {
			    System.out.println("Coordinates match!");
			} else {
			    System.out.println("Coordinates do not match.");
			}
		
	}
	  

	@Then("Macy Logo is on right position")
	public void macy_logo_is_on_right_position() {
		
//		assertEquals(actualX,20);
//		assertEquals(actualY,59);
		
		 if (actualX==20) {
	            System.out.println("Actual X cordinated: " + actualX);
	        } else {
	            System.out.println("Coordinates are not equal");
	        }
		 if (actualY == 59) {
			    System.out.println("Actual Y cordinated: " + actualY);
			} else {
			    System.out.println("Coordinates are not equal");
			}
		
	}
	
	@When("Macy user click on the sale markdown link")
	public void macy_user_click_on_the_sale_markdown_link() {
		macys_HomePageUI.summerSaleMarkdown();  
		
	}

	@Then("Macys user navigate to the landing page")
	public void macys_user_navigate_to_the_landing_page() {
		
		macys_HomePageUI.verifyLandingPage();
	}


}
