package starter.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DetailPage;
import starter.pages.LoginPage;
import starter.pages.LogoutPage;
import starter.pages.RegistrationPage;

public class LogoutStep {
    @Steps
    LogoutPage logoutPage;
    LoginPage loginPage;
    RegistrationPage registrationPage;

    @And("I have login")
    public void iHaveLogin() {
        registrationPage.clckSignIn();
        loginPage.inputEmail("maylananggi@gmail.com");
        loginPage.inputPass("maylanqe22");
        loginPage.clickLogin();
    }

    @When("I click profile icon")
    public void iClickProfileIcon() {
        logoutPage.clckProfileIcon();
    }

    @And("I click logout button")
    public void iClickLogoutButton() {
        logoutPage.clckLogout();
    }

    @Then("I go to login page")
    public void iGoToLoginPage() {
        logoutPage.canLogout();
    }


}
