package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilAppears(){
        var dynamicLoading = homePage.clickFormDynamicLoad().clickExample2();
        dynamicLoading.clickStartButton();
        assertEquals(dynamicLoading.getLoadedText(), "Hello World!",
                "The displayed text is incorrect");
    }
}
