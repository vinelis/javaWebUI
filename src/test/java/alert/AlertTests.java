package alert;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.ContextMenu;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    private WebDriver driver;

    @Test
    public void testsTriggerAlert(){
        ContextMenu contextMenu = homePage.clickContextMenu();
        contextMenu.BoxtoClick();
        String textOut = contextMenu.GetAlertText();
        contextMenu.AcceptAlert();
        assertEquals(textOut, "You selected a context menu", "The text in the alert is wrong");


    }
}
