package test.alta.pages;

import com.github.javafaker.Faker;
import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;
public class RegisterScreen extends BasePageObject {
    public String name = createRandomeName();
    public String password = "NMklop90";
    private By iconRegister() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }
    private By registerPage() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Register\"]");
    }
    private By inputName() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }
    private By inputEmail() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }
    private By inputPassword() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    }
    private By buttonRegister() {
        return MobileBy.xpath("\t\n" + "//android.widget.Button[@content-desc=\"Register\"]");
    }
    public String createRandomeName() {
        Faker faker = new Faker();
        return faker.name().fullName();
    }
    @Step
    public void clickIconRegister() {
        onClick(iconRegister());
    }
    @Step
    public boolean validateOnRegisterPage() {
        return waitUntilPresence(registerPage()).isDisplayed();
    }
    @Step
    public void importNameOnRegister() {
        onType(inputName(),name);
    }
    @Step
    public void importEmailOnRegister() {
        onType(inputEmail(),name + "@gmail.com");
    }
    @Step
    public void importPasswordOnRegister() {
        onType(inputPassword(),password);
    }
    @Step
    public void clickButtonRegister() {
        onClick(buttonRegister());
    }
}

