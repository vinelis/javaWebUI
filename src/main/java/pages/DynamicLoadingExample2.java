package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class DynamicLoadingExample2 {
    WebDriver driver;
    private By startButton = By.tagName("button");
    private By loadedText = By.id("finish");

    public DynamicLoadingExample2(WebDriver driver){
        this.driver = driver;
    }

    public void clickStartButton(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));
    }

    public Boolean isTheStartButtonThere(){
        return driver.findElement(startButton).isDisplayed();
    }

    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }
}
