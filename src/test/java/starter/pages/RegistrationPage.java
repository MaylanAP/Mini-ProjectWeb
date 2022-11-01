package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistrationPage extends PageObject {

    private By fieldSignIn(){
        return By.xpath("//button//i[contains(@class, 'sign-in')]");
    }
    private By fieldRegisUrl(){
        return By.xpath("//a[@href='/auth/register']");
    }
    private By fieldFullName(){
        return By.xpath("//div[label[text()='Nama Lengkap']]/input");
    }
    private By fieldEmailRegis(){
        return By.xpath("//div[label[text()='Email']]/input");
    }
    private By fieldPassRegis(){
        return By.xpath("//div[label[text()='Password']]/input");
    }
    private By fieldButtonRegis(){
        return By.xpath("//button[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    }
    private By logoError(){
        return By.xpath("//div[@class='v-alert__content']");
    }


    public void openWeb(){
        openAt("/");
    }
    public void clckSignIn(){
        $(fieldSignIn()).click();
    }
    public void clckRegis(){
        $(fieldRegisUrl()).click();
    }
    public void urlRegis(){
        openAt("/");
    }
    public void inputFullName(String fullname){
        $(fieldFullName()).type(fullname);
    }
    public void inputEmail(String email){
        $(fieldEmailRegis()).type(email);
    }
    public void inputPass(String password){
        $(fieldPassRegis()).type(password);
    }
    public void clkRegisButton(){
        $(fieldButtonRegis()).click();
    }
    public void successRegis(){
        openAt("https://alta-shop.vercel.app/auth/login");
    }
    public void cantRegis(){
        $(logoError()).isDisplayed();
    }


}
