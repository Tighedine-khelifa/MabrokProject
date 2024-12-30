package objectPages;

import helpers.Config;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AjoutProduitAuPanierPage {


    @FindBy(xpath = "//span[@data-option='moka']")
    WebElement btnCouleur;
    @FindBy(xpath = "//span[normalize-space()='M']")
    WebElement btnTailleM;
    @FindBy(xpath = "//a[normalize-space()='Ajouter au panier']")
    WebElement btnAjouterAuPanier;
    @FindBy(xpath = "//a[@class='font-titles']")
    WebElement txtProduitAuPanier;
    public AjoutProduitAuPanierPage(){
        PageFactory.initElements(Config.driver,this);
    }

    public void clickBtnCouleur(){
        btnCouleur.click();
    }
    public void clickBtnTailleM(){
        btnTailleM.click();
    }
    public void clickBtnAjouterAuPanier(){
        btnAjouterAuPanier.click();
    }
    public String getTxtProduitAuPanier(){
      return   txtProduitAuPanier.getText();
    }


}
