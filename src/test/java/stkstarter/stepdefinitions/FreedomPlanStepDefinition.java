package stkstarter.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import stkstarter.navigation.NavigateTo;

import java.io.File;
import java.io.IOException;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class FreedomPlanStepDefinition {

    @Steps
    NavigateTo navigateTo;

    @Given("^User is on the Sales Tool Kit home page and lands on main menu$")
    public void user_is_on_the_stk_home_page() throws InterruptedException, IOException {
        navigateTo.theStkHomePage();
    }

    //Test Case No 1

    @When("^the user clicks on Data$")
    public void user_clicks_on_data() throws InterruptedException {
        navigateTo.clickData();
    }

    @When("^the user clicks on Light Starter$")
    public void user_clicks_on_light_starter() throws InterruptedException {
        navigateTo.clickLightStarter();
    }

    @When("^the user clicks on Yes$")
    public void user_clicks_on_yes() throws InterruptedException {
        navigateTo.clickYes();
    }

    @When("^the user clicks on Freedom Plan Packages$")
    public void user_clicks_on_freedom_plan_packages() throws InterruptedException {
        navigateTo.clickFreedomPlanPackages();
    }

    @When("^the user clicks on No$")
    public void user_clicks_on_no() throws InterruptedException {
        navigateTo.clickNo();
    }

    @When("^the user clicks on Next$")
    public void user_clicks_on_next() throws InterruptedException {
        navigateTo.clickNext();
    }

    @When("^the user clicks on Save$")
    public void user_clicks_on_save() throws InterruptedException {
        navigateTo.clickSave();
    }

    @When("^the user chooses device option NO$")
    public void user_clicks_on_no_for_devices() throws InterruptedException {
        navigateTo.clickNoForDevices();
    }

    @Then("^the user clicks on Ok and the offer should be saved$")
    public void user_clicks_on_ok() throws InterruptedException {
        navigateTo.clickOk();
        Thread.sleep(1000);
    }

    //Test Case No 2
    @When("^the user chooses device option YES$")
    public void user_chooses_device_option_yes() throws InterruptedException {
        navigateTo.clickYesForDevices();
        Thread.sleep(1000);
    }

    @When("^the user chooses device type$")
    public void user_chooses_device_type() throws InterruptedException {
        navigateTo.clickDeviceTypeAppleiOS();
        Thread.sleep(1000);
    }

    @When("^the user chooses screen$")
    public void user_chooses_screen() throws InterruptedException {
        navigateTo.clickMediumScreenSize();
        Thread.sleep(1000);
    }

    @When("^the user chooses storage capacity$")
    public void user_chooses_storage_capacity() throws InterruptedException {
        navigateTo.clickMedioumStorageCapacity();
        Thread.sleep(1000);
    }

    @When("^the user chooses deal$")
    public void user_chooses_deal() throws InterruptedException {
        navigateTo.clickStandaloneOffer();
        Thread.sleep(1000);
    }

    @When("^the user clicks on mobile packages$")
    public void user_clicks_on_mobile_packages() throws InterruptedException {
        navigateTo.clickMobilePackage();
        Thread.sleep(1000);
    }

    @When("^the user chooses value added offer NO$")
    public void user_chooses_value_added_offer_no() throws InterruptedException {
        navigateTo.clickValueAddedOfferNo();
        Thread.sleep(1000);
    }

    @When("^the user chooses Next for Final Mobile Package$")
    public void user_chooses_next_for_final_mobile_package() throws InterruptedException {
        navigateTo.clickNextForMobilePackage();
        Thread.sleep(1000);
    }

    @When("^the user clicks Save to save mobile package$")
    public void user_clicks_save_to_save_mobile_package() throws InterruptedException {
        navigateTo.clickSaveForMobilePackage();
        Thread.sleep(1000);
    }

    @Then("^the user clicks on Ok and the mobile offer should be saved$")
    public void user_clicks_on_ok_and_mobile_offer_should_be_saved() throws InterruptedException {
        navigateTo.clickOkToSaveMobileOffer();
        Thread.sleep(1000);
    }

    //Test Case No 3

    @When("^the user clicks on Visitor$")
    public void user_clicks_on_visitor_button() throws InterruptedException {
        navigateTo.clickVisitorButton();
        Thread.sleep(1000);
    }

    @When("^the user proceeds$")
    public void user_clicks_on_visitorNext_button() throws InterruptedException {
        navigateTo.clickVisitorNextButton();
        Thread.sleep(1000);
    }

    @When("^the user chooses Visitor Offer$")
    public void user_clicks_on_visitor_offer() throws InterruptedException {
        navigateTo.clickVisitorOffer();
        Thread.sleep(1000);
    }

    @When("^the user hits Next$")
    public void user_clicks_on_visitor_offer_next() throws InterruptedException {
        navigateTo.clickVisitorOfferNext();
        Thread.sleep(1000);
    }



    //****************Prepaid Resident Flow**************************
    @When("^User Select Deal$")
    public void user_select_deal() throws InterruptedException, IOException {
        navigateTo.selectDeal();
        Thread.sleep(1000);
    }

    @When("^Select Type$")
    public void user_select_type() throws InterruptedException, IOException {
        navigateTo.selectType();
        Thread.sleep(1000);
    }

    @When("^Select Deal Type$")
    public void user_select_dealType() throws InterruptedException, IOException {
        navigateTo.selectDealType();
        Thread.sleep(1000);
    }

    @When("^Select Data$")
    public void user_select_data() throws InterruptedException, IOException {
        navigateTo.selectData();
        Thread.sleep(1000);
    }

    @When("^Select Offer$")
    public void user_select_offer() throws InterruptedException, IOException {
        navigateTo.selectOffer();
        Thread.sleep(1000);
    }

    @When("^Select Value Added Offer$")
    public void user_select_value_added_offer() throws InterruptedException, IOException {
        navigateTo.selectValueAddedOffer();
        /*String check = navigateTo.checkValueAddedOffer();
        if(check!= null){
        navigateTo.selectValueAddedOffer();
         }
        else{
           navigateTo.clickNotifyCustomerButton();
        }
        */
        navigateTo.clickNext();
        Thread.sleep(1000);
    }

    @When("^Clicks on Notify Customer$")
    public void user_clicks_on_notify_customer() throws InterruptedException {
        navigateTo.clickNotifyCustomerButton();
        Thread.sleep(1000);
    }

    @When("^Enter Email$")
    public void user_enter_email() throws InterruptedException, IOException {
        navigateTo.enterEmail();
        navigateTo.clickOk();
        Thread.sleep(1000);
    }

    @Then("^Verify that Reference Number is generated$")
    public void user_verify_reference_number() throws InterruptedException, IOException {
        String temp = navigateTo.assertion_check();
        //System.out.println("Reference Number: "+temp );
        assertThat(temp != null);
        navigateTo.clickNotificationOption();
        Thread.sleep(1000);
    }

    @After(value = "@Test")
    public void after() throws IOException {
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "serenity-summary.bat");
        File dir = new File("C:/Users/kashaf.nazir/IdeaProjects/STKSerenityProject");
        pb.directory(dir);
        Process p = pb.start();
    }
}
