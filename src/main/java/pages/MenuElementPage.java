package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuElementPage {
    private WebDriver driver;
    private By menues = By.tagName("li");

    public MenuElementPage(WebDriver driver){
        this.driver = driver;
    }

    public List<WebElement> getMenus() {
        List<WebElement> listmenues = driver.findElements(menues);
        return listmenues;
    }

}
