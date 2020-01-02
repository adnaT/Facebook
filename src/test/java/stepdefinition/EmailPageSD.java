package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webpages.ElementUtil;
import framework.webpages.EmailPage;
import org.testng.Assert;

public class EmailPageSD extends ElementUtil {

    private EmailPage emailPage = new EmailPage();

    @Given("^I am on messenger Page$")
    public void setMessengerPage(){
        Assert.assertEquals(SharedSD.getDriver().getCurrentUrl(), "https://www.facebook.com/");
    }
    @When("^I enter (.+) into (firstname|lastname) text fields on home screen$")
    public void enterDataInto(String value, String textField){
       switch(textField){
                case"firstname":
                    emailPage.enterName(value);
                    break;
                case"lastname":
                    emailPage.enterLastName(value);
        }
    }
   @And("^I enter (.+) into (Mobilenumber) text fields on home screen$")
    public void enterEmailIntoEmailField(String anyText, String textField) throws InterruptedException {

        switch (textField){
            case "Mobilenumber":
                emailPage.enterEmail(anyText);
        }
    }
    @And("^I click on password text field on home screen$")
    public void clickOnText() {
        emailPage.clickOnPasswordText();
    }
    @And("^I click on email text field on home screen$")
    public void clickOnEmail() throws InterruptedException {
        emailPage.clickOnSigupButtom();
        Thread.sleep(1000);
        emailPage.clickEnterEmail();

    }
    @Then("^I verify Error Message for invalid email on homepage$")
    public void verifyEmail() throws InterruptedException {
        Thread.sleep(1000);
     Assert.assertEquals(emailPage.getErrorMessage(), "Please enter a valid mobile number or email address.");
        System.out.println("Verified message : "+emailPage.getErrorMessage());
    }
    @After
    public void after(){
        SharedSD.after();
    }

}




