package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.lang.constant.DynamicConstantDesc;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public Frames clickFromFrames(){
        clickLink("Frames");
        return new Frames(driver);
    }

    public DynamicLoading clickFormDynamicLoad(){
        clickLink("Dynamic Loading");
        return new DynamicLoading(driver);
    }

    public ForgotPasswordPage clickFormForgotPasswordLink(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public ShiftingContentPage clickFormShiftingContent(){
        clickLink("Shifting Content");
        return new ShiftingContentPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSliderPage(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public ContextMenu clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenu(driver);
    }


}
