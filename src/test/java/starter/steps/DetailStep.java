package starter.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DetailPage;

public class DetailStep {
    @Steps
    DetailPage pageHome;

    @And("I open login")
    public void iOpenLogin() {
        pageHome.openLogin();
    }

    @And("I input {string} email and {string} password valid")
    public void iInputEmailAndPasswordValid(String email, String pass) {
        pageHome.inputData(email,pass);
    }

    @And("click login button")
    public void clickLoginButton() {
        pageHome.clckLogButton();
    }

    @And("I can login {string}")
    public void iCanLogin(String result) {
        pageHome.canLogin();
    }

    @When("I click detail button")
    public void iClickDetailButton() {
        pageHome.clkDetailButton();
    }

    @Then("I go to detail product")
    public void iGoToDetailProduct() {
        pageHome.gotoDetail();
    }

    @When("I click {int} star")
    public void iClickStar(int arg0) {
        pageHome.clk4Star();
    }

    @Then("I can see {int} star")
    public void iCanSeeStar(int arg0) {
        pageHome.see4Star();
    }
}
