package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetailPage extends PageObject {

    private By fieldEmail(){
        return By.xpath("//div[label[text() ='Email']]/input");
    }
    private By fieldPassword(){
        return By.xpath("//div[label[text()='Password']]/input");
    }
    private By fieldButtonLogin(){
        return By.xpath("//button[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    }
    private By fieldLogoProfile(){
        return By.xpath("//button[@role='button']");
    }
    private By idDetail(){
        return By.xpath("//div[@id='26']");
    }
    private By fieldButtonDetail() {
        return By.xpath("//button[span[text()='Detail']]");
    }
    private By field4Star(){
        return By.xpath("//button[@aria-label='Rating 4 of 5']");
    }
    private By fieldSee4Star(){
        return By.xpath("//span[@class='black--text text--lighten-2 text-caption mr-2']");
    }




    public void openLogin(){
        openAt("/auth/login");
    }
    public void inputData(String email, String pass){
        $(fieldEmail()).type(email);
        $(fieldPassword()).type(pass);
    }
    public void clckLogButton(){
        $(fieldButtonLogin()).click();
    }
    public void canLogin(){
        $(fieldLogoProfile()).isDisplayed();
    }
    public void clkDetailButton(){
        $(idDetail()).isDisplayed();
        $(fieldButtonDetail()).click();
    }
    public void gotoDetail(){
        openAt("https://alta-shop.vercel.app/products/26");
    }
    public void clk4Star(){
        $(field4Star()).click();
    }
    public void see4Star(){
        $(fieldSee4Star()).isDisplayed();
    }

}