package StepDefination;

import java.io.IOException;

import org.apache.log4j.Logger;

import FileUtility.PropertiyFile;
import Keywords.Keyword;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDef   {
	public static Logger log=Logger.getLogger(LoginStepDef.class);
	@Before
	public void lunchBrowser() throws IOException {
		Keyword.selectAndOpenBrowser("chrome");
		Keyword.maxiMizeWindow();
		Keyword.enterUrl(PropertiyFile.getProperty("url"));
		log.info("Url entered ");
	}

	@Given("user on the Login Page")
	public void user_on_the_login_page() {
		log.info("Login on OrangeHRM successfully");

	}

	@Given("user enters {string} with {string}")
	public void user_enters_with(String user, String pass) throws IOException, InterruptedException {
		Keyword.enterText("XPATH", PropertiyFile.getProperty("username"), user);
		log.info("Username entered");
		Keyword.enterText("XPATH", PropertiyFile.getProperty("password"), pass);
		log.info("Password entered");


	}

	@Given("user click {string} button")
	public void user_click_button(String string) throws InterruptedException, IOException {
		Keyword.clickOnElement("XPATH", PropertiyFile.getProperty("clickOnLogin"));

	}

	@Then("user should see {string}")
	public void user_should_see(String string) throws IOException {
		Keyword.clickOnElement("XPATH", PropertiyFile.getProperty("clickOnPIM"));
		Keyword.clickOnElement("CSS", PropertiyFile.getProperty("clickOnAdd"));
		Keyword.enterText("CSS", PropertiyFile.getProperty("Fname"),"Kiran");
		Keyword.enterText("CSS", PropertiyFile.getProperty("Mname"),"Ramdev");
		Keyword.enterText("CSS", PropertiyFile.getProperty("Lname"),"Junkare");
		Keyword.clearText("XPATH", PropertiyFile.getProperty("Eid"));
		Keyword.enterText("XPATH", PropertiyFile.getProperty("Eid"),"255286");
		//Keyword.clickOnElement("CSS", PropertiyFile.getProperty("uploadPic"));
		//Keyword.uploadPhoto("CSS", PropertiyFile.getProperty("uploadPic"),".//resources//testPic.jpg");
		Keyword.clickOnElement("CSS", PropertiyFile.getProperty("createLoginDetails"));
		Keyword.enterText("XPATH", PropertiyFile.getProperty("UserName"),"TestQAFirstName");
		Keyword.enterText("XPATH", PropertiyFile.getProperty("pass"),"TestQA1234");
		Keyword.enterText("XPATH", PropertiyFile.getProperty("confirmPass"),"TestQA1234");
		Keyword.clickOnElement("CSS", PropertiyFile.getProperty("clickOnSubmit"));	
		
	}

}
