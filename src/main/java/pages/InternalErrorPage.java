package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InternalErrorPage {

    private WebDriver driver;
    private By tittle = By.tagName("h1");

    public InternalErrorPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTittle(){
        return driver.findElement(tittle).getText();
    }

}
