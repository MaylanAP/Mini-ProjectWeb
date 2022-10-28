package starter.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.TransactionPage;

public class TransactionStep {
    @Steps
    TransactionPage transactionPage;

    @And("I click transaksi button")
    public void iClickTransaksiButton() {
        transactionPage.clckButtonTransak();
    }

}
