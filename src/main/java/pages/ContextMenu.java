package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {

    private WebDriver driver;
    private By rectangle = By.id("hot-spot");

    public ContextMenu(WebDriver driver){
        this.driver = driver;
    }


    public void BoxtoClick(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(rectangle)).perform();
    }

    public String GetAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void AcceptAlert(){
        driver.switchTo().alert().accept();
    }
}
