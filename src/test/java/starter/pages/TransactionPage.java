package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class TransactionPage extends PageObject {

    private By fieldTransakButton(){
        return By.xpath("//div//i[contains(@class, 'history')]");
    }

    public void clckButtonTransak() {
        $(fieldTransakButton()).click();
    }

}
