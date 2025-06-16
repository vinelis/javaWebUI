package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By sliderContainer = By.cssSelector("input[type='range']");
    private By rangeSlider = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void slider(Keys n){
        driver.findElement(sliderContainer).sendKeys(n);
    }

    public String numOfSlider(){
        return driver.findElement(rangeSlider).getText();
    }
}
