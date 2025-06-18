package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FramesTests extends BaseTests {

    @Test
    public void testFrames(){
        var frames = homePage.clickFromFrames();
        var nestedFrames = frames.clickInNestedFrames();
        String text1 = nestedFrames.getLeftText();
        String text2 = nestedFrames.getBottomText();
        assertEquals(text1, "LEFT", "Left text is incorrect");
        assertEquals(text2, "BOTTOM", "Bottom text is incorrect");
    }
}
