package testsSuits;

import helpers.Config;
import helpers.Utils;
import io.cucumber.java.en.*;
import objectPages.AccueilMabrokPage;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccueilMabrokStepDef {

   AccueilMabrokPage accueilMabrokPage;
    @Given("Acceder a la page  d accueil Mabrok")
    public void acceder_a_la_page_d_accueil_mabrok() throws Exception {

        Config.driver = new ChromeDriver();
        Config.driver.get(Utils.getProperties("baseUrl"));
        Config.attente(4);
        Config.driver.manage().window().maximize();
        accueilMabrokPage = new AccueilMabrokPage();
    }
    @When("utilisateur survol la souris sur le menu {string}")
    public void utilisateur_survol_la_souris_sur_le_menu(String title) {
        Config.attente(4);
        accueilMabrokPage.survoleMenu(title);
        Config.attente(4);

    }
    @And("utilisateur clique sur le submenu {string}")
    public void utilisateurCliqueSurLeSubmenu(String title1) {
        accueilMabrokPage.clickSubmenuFemme(title1);


    }
    @Then("utilisateur est diriger vers la page submenu {string}")
    public void utilisateur_est_diriger_vers_la_page_submenu(String title2) {
        Config.attente(4);
       Assert.assertEquals(accueilMabrokPage.verifTxtPageChemise(),title2);

    }



}
