package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class BeliPage extends PageObject {

    private By fieldProd1(){
        return By.xpath("//*[@id='70']/div/div[3]/div[2]/button[2]/span");
    }
    private By fieldProd2(){
        return By.xpath("//*[@id='80']/div/div[3]/div[2]/button[2]/span");
    }
    private By fieldJumProd(){
        return By.xpath("//span[@class='v-badge__badge primary']");
    }
    private By fieldIconCart(){
        return By.xpath("//button//i[contains(@class, 'shopping-cart')]");
    }
    private By fieldAllOrder(){
        return By.xpath("//div[@class='v-card__text']");
    }
    private By fieldBayarButton(){
        return By.id("button-bayar");
    }
    private By fieldSeeTransac(){
        return By.xpath("//thead[@class='v-data-table-header']");
    }



    public void buttonBeli1(){
        $(fieldProd1()).click();
    }
    public void resDifProd(){
        $(fieldJumProd()).isDisplayed();
    }
    public void buttonBeli2(){
        $(fieldProd2()).click();
    }
    public void clckIconCart(){
        $(fieldIconCart()).click();
    }
    public void seeAllOrder(){
        $(fieldAllOrder()).isDisplayed();
    }
    public void clckBayarButton(){
        $(fieldBayarButton()).click();
    }
    public void canSeeTransaction(){
        $(fieldSeeTransac()).isDisplayed();
    }
    public void scrollDown(){
        $("//body").sendKeys(Keys.DOWN);
    }

}
