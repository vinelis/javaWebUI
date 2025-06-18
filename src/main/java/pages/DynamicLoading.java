package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoading {
    WebDriver driver;
    private By linkExample2 = By.partialLinkText("Example 2");

    public DynamicLoading(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExample2 clickExample2(){
        driver.findElement(linkExample2).click();
        return new DynamicLoadingExample2(driver);
    }


}
