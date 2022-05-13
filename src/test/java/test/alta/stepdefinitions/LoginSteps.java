package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.alta.pages.LoginScreen;

public class LoginSteps {
    @Steps
    LoginScreen loginScreen;
    @Given("android user on home screen")
    public void androidUserOnHomeScreen() {
        Assert.assertTrue(loginScreen.onPageHome());
//        boolean actul = (loginScreen.onPageHome());
//        Assert.assertTrue(actul);
    }
    @When("android user tap icon login")
    public void androidUserTapIconLogin() {
        loginScreen.clickIconLogin();
        loginScreen.validateOnLoginPage();
    }
    @And("android user input email {string}")
    public void androidUserInputEmail(String email) {
        loginScreen.importEmail(email);
    }
    @And("android user input password {string}")
    public void androidUserInputPassword(String password) {
        loginScreen.importPassword(password);
    }
    @Then("android user tap button login")
    public void androidUserTapButtonLogin() {
        loginScreen.clickButtonlogin();
    }
}
