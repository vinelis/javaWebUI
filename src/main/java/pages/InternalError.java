package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InternalError {

    private WebDriver driver;
    private By tittle = By.tagName("h1");

    public InternalError(WebDriver driver){
        this.driver = driver;
    }

    public String getTittle(){
        return driver.findElement(tittle).getText();
    }

}
