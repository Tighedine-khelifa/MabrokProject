package helpers;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Config {

    public static WebDriver driver;
    public static void attente(int s){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
    }
}
