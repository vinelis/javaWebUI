package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NavigationTest extends BaseTests {

    @Test
    public void testDoesItChangesWindows(){
        var dynamicLoading = homePage.clickFormDynamicLoad();
        var dynamicLoadingExample2 = dynamicLoading.clickControlAndClick();
        getWindowManager().switchToNewTab();
        Boolean startButton = dynamicLoadingExample2.isTheStartButtonThere();
        assertTrue(startButton, "The start button isn't displayed");

    }
}
