package starter.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.BeliPage;

public class BeliStep {
    @Steps
    BeliPage beliPage;

    @When("I click beli button product 1")
    public void iClickBeliButtonProduct1() {
        beliPage.buttonBeli1();
//        beliPage.scrollDown();
    }

    @Then("product increases")
    public void productIncreases() {
        beliPage.resDifProd();
    }

    @And("I click beli button product 2")
    public void iClickBeliButtonProduct(){
        beliPage.buttonBeli2();
        beliPage.scrollDown();
    }

    @And("I click cart icon")
    public void iClickCartIcon() {
        beliPage.clckIconCart();
    }

    @Then("see all order")
    public void seeAllOrder() {
        beliPage.seeAllOrder();
    }

    @Then("click bayar button")
    public void clickBayarButton() {
        beliPage.clckBayarButton();
    }

    @And("see transaction")
    public void seeTransaction() {
        beliPage.canSeeTransaction();
    }

}
