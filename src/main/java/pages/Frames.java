package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Frames {

    WebDriver driver;
    private By nestedFrames = By.linkText("Nested Frames");

    public Frames(WebDriver driver){
        this.driver = driver;
    }

    public NestedFrames clickInNestedFrames(){
        driver.findElement(nestedFrames).click();
        return new NestedFrames(driver);
    }
}
