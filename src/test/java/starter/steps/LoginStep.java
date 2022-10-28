package starter.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginStep {
    @Steps
    LoginPage logPage;

    @When("I input {string} email")
    public void iInputEmail(String arg0) {
        logPage.inputEmail(arg0);
    }

    @And("I input {string} password")
    public void iInputPassword(String arg0) {
        logPage.inputPass(arg0);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        logPage.clickLogin();
    }

    @Then("i get {string} result")
    public void iGetResult(String result) {
        if (result.equals("can login")){
            logPage.canLogin();
        } else if (result.equals("error message")){
            logPage.errorMessageLog();
        }
    }

}