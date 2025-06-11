package base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver_vers137.0.7151.68.exe");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @Test
    public void testsCountMenus(){
        WebElement shiftingContent = driver.findElement(By.linkText("Shifting Content"));
        shiftingContent.click();

        WebElement example1 = driver.findElement(By.linkText("Example 1: Menu Element"));
        example1.click();

        List<WebElement> menus = driver.findElements(By.tagName("li"));
        assertEquals(menus.size(), 5);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
