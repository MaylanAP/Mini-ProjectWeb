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
    public void iInputEmail(String email) {
        logPage.inputEmail(email);
    }

    @And("I input {string} password")
    public void iInputPassword(String pass) {
        logPage.inputPass(pass);
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