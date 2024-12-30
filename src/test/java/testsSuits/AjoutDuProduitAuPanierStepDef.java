package testsSuits;

import helpers.Config;
import helpers.Utils;
import io.cucumber.java.en.*;
import objectPages.AccueilMabrokPage;
import objectPages.AjoutProduitAuPanierPage;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjoutDuProduitAuPanierStepDef {

    AjoutProduitAuPanierPage ajoutProduitAuPanierPage;
    @Given("utilisateur est sur la page produit")
    public void utilisateur_est_sur_la_page_produit() throws Exception {
        Config.driver = new ChromeDriver();
        Config.driver.get(Utils.getProperties("link_Produit_Panier"));
        Config.attente(4);
        Config.driver.manage().window().maximize();
        ajoutProduitAuPanierPage = new AjoutProduitAuPanierPage();


    }
    @When("utilisateur clique sur la couleur et la taille et cliquer Ajouter au panier")
    public void utilisateur_clique_sur_la_couleur_et_la_taille_et_cliquer_ajouter_au_panier() throws InterruptedException {
        ajoutProduitAuPanierPage.clickBtnCouleur();
        ajoutProduitAuPanierPage.clickBtnTailleM();
        Thread.sleep(2000);
        ajoutProduitAuPanierPage.clickBtnAjouterAuPanier();

    }

    @Then("utilisateur verifier le produit ajouter au panier {string}")
    public void utilisateur_verifier_le_produit_ajouter_au_panier(String produit) throws InterruptedException {
       Thread.sleep(3000);
        Assert.assertEquals(ajoutProduitAuPanierPage.getTxtProduitAuPanier(),produit);

    }
}
