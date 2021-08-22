package com.FinWorks.step_definitions;
import com.FinWorks.Pages.LoginPage;
import com.FinWorks.Pages.LoginPageEvelin;
import com.FinWorks.Pages.LogoutPageEvelin;
import com.FinWorks.Pages.LoginPage;
import com.FinWorks.utilities.BrowserUtils;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LogoutStepDefs_Evelin {
    @And("enter login with {string} and {string}")
    public void enterValidCredentials(String username, String password) {
        new LoginPage().login(username, password);
    }
    @And("click on {string} button")
    public void clickOnDropdawnButton(String dropdawn) {
        new LogoutPageEvelin().getDropdawnMenu().click();
    }

    @Then("a drop down many is displayed")
    public void aDropDownManyIsDisplayed() {
        Assert.assertTrue(new LogoutPageEvelin().getDropdawnMenu().isDisplayed());
    }

    @And("user clicks on {string} button")
    public void userClicksTheLogoutButton(String login) {
        new LogoutPageEvelin().getLogoutButton().click();
    }

    @Then("users navigate to {string} page")
    public void usersGoOutFromAplication(String expectedTitle) {
        BrowserUtils.waitFor(2);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

}
