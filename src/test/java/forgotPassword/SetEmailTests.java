package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPassword;
import pages.InternalError;

import static org.testng.Assert.assertEquals;


public class SetEmailTests extends BaseTests {

    @Test
    public void setEmail(){
        ForgotPassword forgotPassword = homePage.clickFormForgotPasswordLink();
        forgotPassword.setEmail("luca@gmail.com");
        InternalError internalError = forgotPassword.clickRetrieveButton();
        assertEquals(internalError.getTittle(),"Internal Server Error", "The final answer's not what expected");

    }
}
