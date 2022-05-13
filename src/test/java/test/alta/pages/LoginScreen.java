package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {
    private By home() {
        return MobileBy.AccessibilityId("Products");
    }
    private By iconLogin() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By loginPage() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Login\"]");
    }
    private By inputEmail() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    private By inputPassword() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }
    private By buttonLogin() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }
    @Step
    public boolean onPageHome() {
        return waitUntilPresence(home()).isDisplayed();
    }
    @Step
    public void clickIconLogin() {
        onClick(iconLogin());
    }
    @Step
    public boolean validateOnLoginPage() {
        return waitUntilPresence(loginPage()).isDisplayed();
    }
    @Step
    public void importEmail(String email) {
        onType(inputEmail(), email);
    }
    @Step
    public void importPassword(String password) {
        onType(inputPassword(), password);
    }
    @Step
    public void clickButtonlogin() {
        onClick(buttonLogin());
    }
}