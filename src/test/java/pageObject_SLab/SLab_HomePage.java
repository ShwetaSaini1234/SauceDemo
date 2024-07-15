package pageObject_SLab;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.bytebuddy.implementation.bind.annotation.Super;
import utilities.ExcelReader;

public class SLab_HomePage {
	
	
	private WebDriver webDriver;
    String userNameExcelValue;
    String passwordExcelValue;
	
	private By Username = By.id("user-name");
	private By Password = By.id("password");
	private By LoginButton = By.id("login-button");
	
	
	
	
	
	public SLab_HomePage(WebDriver driver) {
		super();
		this.webDriver = driver;
	}
	
//   public void readDataFromSheet(String sheetName, Integer rowNumber) throws IOException {
//        utilities.ExcelReader reader = new ExcelReader();
//        List<Map<String, String>> testdata = reader.getData("src/test/resources/TestData/OpenCart_TestData.xlsx", sheetName);
//        userNameExcelValue = testdata.get(rowNumber).get("UserName");
//        passwordExcelValue = testdata.get(rowNumber).get("Password");
//   }
//	
//   public void sendUserName() {
//	   
//	   webDriver.findElement(Username).sendKeys(userNameExcelValue); 
//   }
//   
//   public void sendPasswor() {
//	   
//	   webDriver.findElement(Password).sendKeys(passwordExcelValue); 
//   }
//   
//   public void loginButton() {
//	   
//	   webDriver.findElement(LoginButton).click();
//   }
	
	
	public void setuser (String username) {

		webDriver.findElement(Username).sendKeys("UserName");

	}	

	public void setpassword (String password) {

		webDriver.findElement(Password).sendKeys("Password");	

	}

	 public void clickloginbtn (){

		 webDriver.findElement(LoginButton).click();

	}
   
}
