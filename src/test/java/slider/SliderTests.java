package slider;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void TestsLetsSlide(){
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSliderPage();

        for(int i = 0; i < 8; i++){
            horizontalSliderPage.slider(Keys.ARROW_RIGHT);
        }

        assertEquals(horizontalSliderPage.numOfSlider(), "4", "The number of slides is not what expected");
    }
}
