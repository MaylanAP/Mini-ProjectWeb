package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {

    private By fieldProfIcon(){
        return By.xpath("//button[@role='button']");
    }
    private By fieldLogoutButton(){
        return By.xpath("//i[@class='v-icon notranslate fas fa-sign-in theme--light']");
    }
    private By fieldLoginPage(){
        return By.xpath("//div[@class='v-card__title']");
    }


    public void clckProfileIcon(){
        $(fieldProfIcon()).click();
    }
    public void clckLogout(){
        $(fieldLogoutButton()).click();
    }
    public void canLogout(){
        $(fieldLoginPage()).isDisplayed();
    }

}
