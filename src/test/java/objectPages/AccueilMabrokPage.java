package objectPages;

import helpers.Config;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccueilMabrokPage {

@FindBy(xpath = "(//ul[@id='primary-menu'])[1]/li")
    List<WebElement> linkMenus;
@FindBy(xpath = "/html[1]/body[1]/div[4]/header[1]/div[1]/div[1]/div[2]/nav[1]/div[1]/div[3]/div[1]/ul[1]/li[3]/div[1]/ul[1]/li/a[1]/span[1]")
    List<WebElement> linkSubmenus;

@FindBy(xpath = "//h1[normalize-space()='Chemises & Blouses']")
 WebElement verifPage;
public AccueilMabrokPage(){
    PageFactory.initElements(Config.driver,this);
}

public void survoleMenu(String title){
    Actions actions = new Actions(Config.driver);
    System.out.println(linkMenus.size());
    for(WebElement menu:linkMenus){
        System.out.println(menu.getText());
        if (menu.getText().contains(title)){
            actions.moveToElement(menu).perform();
            break;
        }
    }
}
    public void clickSubmenuFemme(String title){
        System.out.println(linkSubmenus.size());
        for(WebElement submenu:linkSubmenus){
            System.out.println(submenu.getText());
            if (submenu.getText().contains(title)){
                submenu.click();
                break;
            }
        }
    }

    public String verifTxtPageChemise(){
      return verifPage.getText();
    }


}
