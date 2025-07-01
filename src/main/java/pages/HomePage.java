package pages;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By quienesSomosBoton = By.linkText("Quienes somos");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }






}
