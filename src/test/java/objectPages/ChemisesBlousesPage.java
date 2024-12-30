package objectPages;

import helpers.Config;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ChemisesBlousesPage {
@FindBy(xpath = "/html[1]/body[1]/div[5]/div[4]/div[4]/div[1]/div[4]/div[1]/ul[1]/li/div[1]/div[2]/h3[1]/a[1]")
    List<WebElement> listChemisesBlouses;
@FindBy(xpath = "//h1[normalize-space()='CHEMISE ISRA']")
    WebElement verifTxt;
    public ChemisesBlousesPage(){
        PageFactory.initElements(Config.driver,this);
    }

    public void clickChemiseBlouse(String produit){
        System.out.println(listChemisesBlouses.size());
        for(WebElement chemise : listChemisesBlouses){
            if (chemise.getText().contains(produit)){
                chemise.click();
                break;
            }
        }
    }

    public String getVerifTxt(){
        return verifTxt.getText();
    }
}
