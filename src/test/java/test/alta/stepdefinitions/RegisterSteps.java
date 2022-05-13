package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import test.alta.pages.LoginScreen;
import test.alta.pages.RegisterScreen;

public class RegisterSteps {
    @Steps
    RegisterScreen registerScreen;
    @Steps
    LoginScreen loginScreen;
    @And("android user tap register account")
    public void androidUserTapRegisterAccount() {
        registerScreen.clickIconRegister();
    }
    @And("validate on register page")
    public void validateOnRegisterPage() {
        registerScreen.validateOnRegisterPage();
    }
    @And("android user input name")
    public void androidUserInputName() {
        registerScreen.importNameOnRegister();
    }
    @And("android user input email")
    public void androidUserInputEmail() {
        registerScreen.importEmailOnRegister();
    }
    @Then("android user input password")
    public void androidUserInputPassword() {
        registerScreen.importPasswordOnRegister();
    }
    @And("android user tap button register")
    public void androidUserTapButtonRegister() {
        registerScreen.clickButtonRegister();
    }
    @And("android user see the login page")
    public void androidUserSeeTheLoginPage() {
        loginScreen.validateOnLoginPage();
    }
}
