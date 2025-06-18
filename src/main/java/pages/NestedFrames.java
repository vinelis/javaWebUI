package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFrames {

    WebDriver driver;
    private String frameTop = "frame-top";
    private String frameLeft = "frame-left";
    private String frameBottom = "frame-bottom";
    private By bodyText = By.tagName("body");

    public NestedFrames(WebDriver driver){
        this.driver = driver;
    }

    public String getLeftText(){
        switchToTopLeftFrame();
        String text = driver.findElement(bodyText).getText();
        switchToMainArea();
        return text;
    }

    public String getBottomText(){
        switchToBottomFrame();
        String text = driver.findElement(bodyText).getText();
        switchToMainArea();
        return text;
    }

    public void switchToTopFrame(){
        driver.switchTo().frame(frameTop);
    }

    public void switchToTopLeftFrame(){
        switchToTopFrame();
        driver.switchTo().frame(frameLeft);
    }

    public void switchToBottomFrame(){
        driver.switchTo().frame(frameBottom);
    }

    public void switchToMainArea(){
        driver.switchTo().defaultContent();
    }








}
