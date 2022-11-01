package starter.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.RegistrationPage;

public class RegistrationStep {
    @Steps
    RegistrationPage regisPage;

    @Given("I open the website")
    public void iOpenTheWebsite(){
        regisPage.openWeb();
    }

    @When("I click sign in button")
    public void iClickSignInButton() {
        regisPage.clckSignIn();
    }

    @And("I click register link")
    public void iClickRegisterLink() {
        regisPage.clckRegis();
    }

    @And("I input {string} fullname")
    public void iInputFullname(String arg0) {
        regisPage.inputFullName(arg0);
    }

    @And("I input {string} new email")
    public void iInputNewEmail(String arg0) {
        regisPage.inputEmail(arg0);
    }

    @And("I input {string} new password")
    public void iInputNewPassword(String arg0) {
        regisPage.inputPass(arg0);
    }

    @And("I click register button")
    public void iClickRegisterButton() {
        regisPage.clkRegisButton();
    }

    @Then("I can {string} register")
    public void iCanRegister(String result) {
        if (result.equals("can regis")){
            regisPage.successRegis();
        }else if (result.equals("cant regis")){
            regisPage.cantRegis();
        }
    }



}
