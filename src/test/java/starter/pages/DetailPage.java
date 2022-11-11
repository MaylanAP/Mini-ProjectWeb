package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DetailPage extends PageObject {

    private By fieldDetail() {
        return By.xpath("//*[@id='70']/div/div[3]/div[2]/button[1]/span");
    }
    private By fieldSeeDetail(){
        return By.xpath("//div[@class='v-card__text']");
    }
    private By field4Star() {
        return By.xpath("//button[@aria-label='Rating 4 of 5']");
    }
    private By fieldSee4Star() {
        return By.xpath("//span[@class='black--text text--lighten-2 text-caption mr-2']");
    }

    public void clckDetail(){
        $(fieldDetail()).click();
    }
    public void seeDetail(){
        $(fieldSeeDetail()).isDisplayed();
    }
    public void clck4Star(){
        $(field4Star()).click();
    }
    public void see4Start(){
        $(fieldSee4Star()).isDisplayed();
    }


}