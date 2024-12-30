package testsSuits;

import helpers.Config;
import helpers.Utils;
import io.cucumber.java.en.*;
import objectPages.ChemisesBlousesPage;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChemisesBlousesStepDef {
ChemisesBlousesPage chemisesBlousesPage;
    @Given("utilisateur est sur la page chemises et blouses")
    public void utilisateur_est_sur_la_page_chemises_et_blouses() throws Exception{

        Config.driver = new ChromeDriver();
        Config.driver.get(Utils.getProperties("link_Chemise_Blouses"));
        Config.attente(4);
        Config.driver.manage().window().maximize();
        chemisesBlousesPage = new ChemisesBlousesPage();

    }

    @When("utilisateur clique sur le produit {string}")
    public void utilisateur_clique_sur_le_produit(String produit) {
        chemisesBlousesPage.clickChemiseBlouse(produit);

    }

    @Then("utilisateur est redirigé vers la page du produit et le produit {string} est affiche")
    public void utilisateur_est_redirigé_vers_la_page_du_produit_et_le_produit_est_affiche(String produit) {
      Config.attente(4);
       Assert.assertEquals(chemisesBlousesPage.getVerifTxt(),produit);
    }
}
