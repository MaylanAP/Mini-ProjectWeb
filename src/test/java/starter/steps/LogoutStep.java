package starter.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DetailPage;
import starter.pages.LogoutPage;

public class LogoutStep {
    @Steps
    LogoutPage logoutPage;

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
