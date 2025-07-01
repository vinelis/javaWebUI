package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTests {
    protected WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver_vers137.0.7151.68.exe");
        driver = new ChromeDriver();
    }


    @AfterClass
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

}
