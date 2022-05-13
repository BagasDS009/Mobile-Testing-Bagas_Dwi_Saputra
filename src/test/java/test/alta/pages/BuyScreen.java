package test.alta.pages;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;
public class BuyScreen extends BasePageObject {
    private By itemOne() {
        return By.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");
    }
    private By itemTwo() {
        return By.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[2]");
    }
    private By itemThree() {
        return By.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[3]");
    }
    private By shopeChart() {
        return By.xpath("//android.widget.Button[@content-desc=\"3\"]");
    }
    @Step
    public void clickItemOne() {
        onClick(itemOne());
    }
    @Step
    public void clickItemTwo() {
        onClick(itemTwo());
    }
    @Step
    public void clickItemThree() {
        onClick(itemThree());
    }
    @Step
    public void clickIconShopchart() {
        onClick(shopeChart());
    }
}