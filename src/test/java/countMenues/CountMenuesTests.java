package countMenues;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.MenuElementPage;
import pages.ShiftingContentPage;

import static org.testng.AssertJUnit.assertEquals;

public class CountMenuesTests extends BaseTests {

    @Test
    public void getMenuesCount(){
        ShiftingContentPage shiftingContent = homePage.clickFormShiftingContent();
        MenuElementPage menuElement = shiftingContent.clickToMenu();
        assertEquals("There's an error counting the menues", menuElement.getMenus().size(), 5);
    }
}
