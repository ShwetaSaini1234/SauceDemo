package stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import browserlaunch.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject_SLab.SLab_HomePage;
import pageobjects.LoginPage;
import utilities.ExcelReader;

public class SLab_HomePage_SD {
	
	
	SLab_HomePage slabHomepage= new SLab_HomePage(Driverfactory.getDriver());
	
	LoginPage loginPage = new LoginPage(Driverfactory.getDriver());
	
	int Rownumber;
	String sheetName;
	
	
	@Given("SLab user is on login page")
	public void s_lab_user_is_on_login_page() {
		Driverfactory.getDriver().get("https://www.saucedemo.com/");	
	}

	@When("SLabser clicks on Login button with entering valid Username {string} and Password {int}")
	public void s_labser_clicks_on_login_button_with_entering_valid_username_s_lab_home_page_and_password(String string, Integer int1) throws IOException {
		
		utilities.ExcelReader reader = new ExcelReader();
		List<Map<String,String>> LoginData= reader.getData("src/test/resources/TestData/OpenCart_TestData.xlsx", sheetName);

		String Username= LoginData.get(Rownumber).get("UserName");
		String password= LoginData.get(Rownumber).get("Password");

		slabHomepage.setuser(Username);
		slabHomepage.setpassword(password);
		slabHomepage.clickloginbtn();
	}

	@Then("SLab user should land on home page")
	public void s_lab_user_should_land_on_home_page() {
	   
		
	}
	
//	@Given("SLab user is in Home Page")
//	public void s_lab_user_is_in_home_page() {
//		
//		Driverfactory.getDriver().get("https://www.saucedemo.com/"); 
//	}
//
//	@When("SLab user enters sheetname {string} and rownumber {int}")
//	public void s_lab_user_enters_sheetname_and_rownumber(String string, Integer int1) throws IOException {
//	   
//		slabHomepage.readDataFromSheet(string, int1);
//	}
//
//	@When("SLab userusername {string} and password {string} and click on login button")
//	public void s_lab_userusername_and_password_and_click_on_login_button(String string, String string2) throws IOException {
//		slabHomepage.sendUserName();
//		slabHomepage.sendPasswor();
//		slabHomepage.loginButton();
//		
//	}
//
//	@Then("SLab user navigates to DashBoard Page")
//	public void s_lab_user_navigates_to_dash_board_page() {
//	   
		
	
}
