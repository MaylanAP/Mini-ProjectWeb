package starter.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DetailPage;

public class DetailStep {
    @Steps
    DetailPage detailPage;

    @When("I click detail button")
    public void iClickDetailButton() {
        detailPage.clckDetail();
    }

    @Then("I go to detail product")
    public void iGoToDetailProduct() {
        detailPage.seeDetail();
    }

    @When("I click 4 star")
    public void iClick4Star() {
        detailPage.clck4Star();
    }

    @Then("I can see 4 star")
    public void iCanSee4Star() {
        detailPage.see4Start();
    }
}
