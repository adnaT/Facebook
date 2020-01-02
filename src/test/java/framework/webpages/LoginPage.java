package framework.webpages;

import org.openqa.selenium.By;

public class LoginPage extends ElementUtil {

    private By firstnamebox = By.name("firstname");
    private By lastnamebox = By.name("lastname");
    private By signUpButton = By.name("websubmit");


    public void enterName(String firstname){
        setValue(firstnamebox, firstname);
    }
    public void enterLastName(String lastname){
        setValue(lastnamebox, lastname);
    }
    public void signupButtonIsEnable() throws InterruptedException {
        clickOn(signUpButton);
        boolean enable = isElementEnabled(signUpButton);
        System.out.println("signup button is disable : "+enable);
        Thread.sleep(1000);
    }

}
