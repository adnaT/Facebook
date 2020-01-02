package framework.webpages;

import org.openqa.selenium.By;

public class EmailPage extends ElementUtil{

    private By firstnamebox = By.name("firstname");
    private By lastnamebox = By.name("lastname");
    private By emailField = By.cssSelector("#u_0_k");
    private By signUpButton = By.name("websubmit");
    private By passwordText = By.xpath("//input[@id='u_0_p']");
    private By reEmail = By.name("reg_email_confirmation__");
    private By errorMessage = By.xpath("//div[contains(text(),'Please enter a valid mobile number or email address.')]");


    public void enterName(String firstname){
        setValue(firstnamebox, firstname);
    }
    public void enterLastName(String lastname){
        setValue(lastnamebox, lastname);
    }
    public void enterEmail(String email) throws InterruptedException {
        Thread.sleep(1000);
        setValue(emailField, email);
    }
    public void clickOnPasswordText(){
        clickOn(passwordText);
    }
    public void clickEnterEmail() throws InterruptedException {
        clickOn(emailField);
    }
    public void clickOnSigupButtom(){
        clickOn(signUpButton);
    }
    public String getErrorMessage(){
       return  getTextFromElement(errorMessage);

    }
    }

