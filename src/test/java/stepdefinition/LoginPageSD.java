package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webpages.ElementUtil;
import framework.webpages.LoginPage;

public class LoginPageSD extends ElementUtil {

    private LoginPage loginPage = new LoginPage();

    @When("^I enter (.+) into (firstname|lastname) text field on the messenger page$")
    public void enterDataIntoTextField(String value,String textField) throws InterruptedException {
        Thread.sleep(1000);
        switch(textField){
            case"firstname":
                loginPage.enterName(value);
                break;
            case"lastname":
                loginPage.enterLastName(value);
         Thread.sleep(1000);
        }
    }
    @Then("^I verify that signup button is disable at homepage$")
    public void signupButtonIsEnable() throws InterruptedException {
        loginPage.signupButtonIsEnable();
        }
    }




