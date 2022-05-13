package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.alta.pages.BuyScreen;

public class BuySteps {
    @Steps
    BuyScreen buyScreen;
//    @When("android user tap buy one once")
//    public void androidUserTapBuyOneOnce() {
//        buyScreen.clickItemOne();
//    }
//    @And("android user tap buy two once")
//    public void androidUserTapBuyTwoOnce() {
//        buyScreen.clickItemTwo();
//    }
//    @And("android user tap buy three once")
//    public void androidUserTapBuyThreeOnce() {
//        buyScreen.clickItemThree();
//    }
//    @Then("android user tap icon shop chart")
//    public void androidUserTapIconShopChart() {
//        buyScreen.clickIconShopchart();
//    }
    @When("android user tap buy one \"([^\"]*)\"$")
    public void androidUserTapBuyOne(String method) {
        if (method.equals("once")){
            buyScreen.clickItemOne();
        } else if (method.equals("twice")){
            buyScreen.clickItemOne();
            buyScreen.clickItemOne();
        }
    }
    @And("android user tap buy two \"([^\"]*)\"$")
    public void androidUserTapBuyTwo(String method) {
        if (method.equals("once")){
            buyScreen.clickItemTwo();
        } else if (method.equals("twice")) {
            buyScreen.clickItemTwo();
            buyScreen.clickItemTwo();
        }
    }
    @And("android user tap buy three \"([^\"]*)\"$")
    public void androidUserTapBuyThree(String method) {
        if (method.equals("once")){
            buyScreen.clickItemThree();
        } else if (method.equals("twice")) {
            buyScreen.clickItemThree();
            buyScreen.clickItemThree();
        }
    }
    @Then("android user tap icon shop chart \"([^\"]*)\"$")
    public void androidUserTapIconShopChart(String method) {
        if (method.equals("once")){
            buyScreen.clickIconShopchart();
        } else if (method.equals("once on twice")) {
            buyScreen.clickIconShopchart();
        }
    }
}
