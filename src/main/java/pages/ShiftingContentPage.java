package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentPage {

    private WebDriver driver;
    private By toMenu = By.linkText("Example 1: Menu Element");



    public ShiftingContentPage(WebDriver driver){
        this.driver = driver;
    }

    public MenuElementPage clickToMenu(){
        driver.findElement(toMenu).click();
        return new MenuElementPage(driver);
    }


}
