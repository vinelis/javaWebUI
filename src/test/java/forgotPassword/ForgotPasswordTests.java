package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.InternalErrorPage;

import static org.testng.Assert.assertEquals;


public class ForgotPasswordTests extends BaseTests {

    @Test
    public void TestsSetEmail(){
        ForgotPasswordPage forgotPassword = homePage.clickFormForgotPasswordLink();
        forgotPassword.setEmail("luca@gmail.com");
        InternalErrorPage internalError = forgotPassword.clickRetrieveButton();
        assertEquals(internalError.getTittle(),"Internal Server Error", "The final answer's not what expected");

    }
}
