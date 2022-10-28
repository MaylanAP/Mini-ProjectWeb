package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By fieldEmail(){
        return By.xpath("//div[label[text() ='Email']]/input");
    }
    private By fieldPassword(){
        return By.xpath("//div[label[text()='Password']]/input");
    }
    private By fieldButtonLogin(){
        return By.xpath("//button[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    }
    private By fieldCanLogin(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]");
    }
    private By fieldErrorMessage(){
        return By.xpath("//div[@class='v-alert__content']");
    }


    public void inputEmail(String email){
        $(fieldEmail()).type(email);
    }
    public void inputPass(String password){
        $(fieldPassword()).type(password);
    }
    public void clickLogin(){
        $(fieldButtonLogin()).click();
    }
    public void canLogin() {
        $(fieldCanLogin()).isDisabled();
    }
    public void errorMessageLog(){
        $(fieldErrorMessage()).isDisplayed();
    }

}
