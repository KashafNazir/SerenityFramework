package stkstarter.navigation;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

public class NavigateTo extends UIInteractionSteps {

    StkHomePage stkHomePage;
    WebDriver driver;

    @Step("Open the Stk home page")
    public void theStkHomePage() throws InterruptedException, IOException {
        stkHomePage.open();
        //Thread.sleep(5000);
        $(StkHomePage.OK_BUTTON).click();
        ExcelFile objExcelFile = new ExcelFile();
        String filePath = System.getProperty("user.dir") + "\\src\\excelExportAndFileIO";
        objExcelFile.readExcel("C:\\Users\\kashaf.nazir\\IdeaProjects\\STKSerenityProject\\src\\test\\resources\\testdata", "data.xlsx", "stkData");
        $(ExcelFile.emiratesId);
        $(StkHomePage.EMIRATES_ID).type(ExcelFile.emiratesId);
        Thread.sleep(1000);
        $(StkHomePage.LAUNCH_BUTTON).click();
        Thread.sleep(3000);

    }

    @Step("Open Data Options")
    public void clickData() throws InterruptedException {
        $(StkHomePage.DATA_BUTTON).click();
        Thread.sleep(3000);
    }

    @Step("Open Light Starter Options")
    public void clickLightStarter() throws InterruptedException {
        $(StkHomePage.LIGHT_STARTER_BUTTON).click();
        Thread.sleep(3000);
    }

    @Step("Open Light Starter Discounted Offer Options Yes")
    public void clickYes() throws InterruptedException {
        $(StkHomePage.YES_BUTTON).click();
        Thread.sleep(3000);
    }

    @Step("Open freedom plan packages")
    public void clickFreedomPlanPackages() throws InterruptedException {
        $(StkHomePage.FREEDOM_PLAN_PACKAGE_BUTTON).click();
        Thread.sleep(3000);
    }

    @Step("Choose value added option No")
    public void clickNo() throws InterruptedException {
        $(StkHomePage.NO_BUTTON).click();
        Thread.sleep(3000);
    }

    @Step("Click Next for final freedom plan package")
    public void clickNext() throws InterruptedException {
        $(StkHomePage.NEXT_BUTTON).click();
        Thread.sleep(3000);
    }

    @Step("Click save to save freedom plan package")
    public void clickSave() throws InterruptedException {
        $(StkHomePage.SAVE_BUTTON).click();
        Thread.sleep(3000);
    }

    @Step("Click device option no")
    public void clickNoForDevices() throws InterruptedException {
        $(StkHomePage.NO_DEVICES_BUTTON).click();
        Thread.sleep(3000);
    }



    ///////////////////////////
    @Step("Click device option yes")
    public void clickYesForDevices() throws InterruptedException {
        $(StkHomePage.YES_DEVICE_BUTTON).click();
        Thread.sleep(3000);
    }

    @Step("Click AppleiOS device")
    public void clickDeviceTypeAppleiOS() throws InterruptedException {
        $(StkHomePage.iOS_DEVICE_BUTTON).click();
        Thread.sleep(3000);
    }

    @Step("Click Medium Screen Size")
    public void clickMediumScreenSize() throws InterruptedException {
        $(StkHomePage.MEDIUM_SCREEN_BUTTON).click();
        Thread.sleep(3000);
    }

    @Step("Click Medium Storage Capacity")
    public void clickMedioumStorageCapacity() throws InterruptedException {
        $(StkHomePage.MEDIUM_CAPACITY_BUTTON).click();
        Thread.sleep(3000);
    }

    @Step("Click standalone option")
    public void clickStandaloneOffer() throws InterruptedException {
        $(StkHomePage.STANDALONE_BUTTON).click();
        Thread.sleep(3000);
    }

    @Step("Click first mobile package")
    public void clickMobilePackage() throws InterruptedException {
        $(StkHomePage.FIRST_MOBILE_PACKAGE_BUTTON).click();
        Thread.sleep(3000);
    }

    @Step("Click value added option for mobile iOS as No")
    public void clickValueAddedOfferNo() throws InterruptedException {
        $(StkHomePage.VALUE_ADDED_NO_BUTTON).click();
        Thread.sleep(3000);
    }

    @Step("Click Next for final Mobile Package")
    public void clickNextForMobilePackage() throws InterruptedException {
        $(StkHomePage.MOBILE_IOS_NEXT_BUTTON).click();
        Thread.sleep(3000);
    }

    @Step("Click save to save iOS Mobile package")
    public void clickSaveForMobilePackage() throws InterruptedException {
        $(StkHomePage.SAVE_IOS_MOBILE_BUTTON).click();
        Thread.sleep(3000);
    }

    @Step("Save mobile package offer")
    public void clickOkToSaveMobileOffer() throws InterruptedException {
        $(StkHomePage.OK_IOS_MOBILE_BUTTON).click();
        Thread.sleep(3000);
    }

    //Test Case 3

    @Step("Click Visitor button")
    public void clickVisitorButton() throws InterruptedException {
        $(StkHomePage.VISITOR_BUTTON).click();
        Thread.sleep(3000);
    }

    @Step("Click Visitor Next button")
    public void clickVisitorNextButton() throws InterruptedException {
        $(StkHomePage.VISITOR_NEXT_BUTTON).click();
        Thread.sleep(3000);
    }

    @Step("Click Visitor Offer")
    public void clickVisitorOffer() throws InterruptedException {
        $(StkHomePage.VISITOR_OFFER).click();
        Thread.sleep(3000);
    }

    @Step("Click Visitor Offer Next")
    public void clickVisitorOfferNext() throws InterruptedException {
        $(StkHomePage.VISITOR_OFFER_NEXT).click();
        Thread.sleep(5000);
    }


    //****************Prepaid Resident Flow**************************
    @Step("User Selects Deal from Main Menu")
    public void selectDeal() throws InterruptedException, IOException {
        ExcelFile objExcelFile = new ExcelFile();
        String filePath = System.getProperty("user.dir") + "\\src\\excelExportAndFileIO";
        objExcelFile.readExcel("C:\\Users\\kashaf.nazir\\IdeaProjects\\STKSerenityProject\\src\\test\\resources\\testdata", "data.xlsx", "stkData");
        String deal = ExcelFile.deal;
        $(org.openqa.selenium.By.xpath("//*[text()='" + deal + "']")).click();
       // $(StkHomePage.DEAL_ID).type(ExcelFile.deal);
        Thread.sleep(2000);
    }

    @Step("User Selects Type from Menu")
    public void selectType() throws InterruptedException, IOException {
        ExcelFile objExcelFile = new ExcelFile();
        String filePath = System.getProperty("user.dir") + "\\src\\excelExportAndFileIO";
        objExcelFile.readExcel("C:\\Users\\kashaf.nazir\\IdeaProjects\\STKSerenityProject\\src\\test\\resources\\testdata", "data.xlsx", "stkData");
        String type = ExcelFile.type;
        $(org.openqa.selenium.By.xpath("//*[text()='" + type + "']")).click();
        Thread.sleep(2000);
    }

    @Step("User Selects Deal Type from Menu")
    public void selectDealType() throws InterruptedException, IOException {
        ExcelFile objExcelFile = new ExcelFile();
        String filePath = System.getProperty("user.dir") + "\\src\\excelExportAndFileIO";
        objExcelFile.readExcel("C:\\Users\\kashaf.nazir\\IdeaProjects\\STKSerenityProject\\src\\test\\resources\\testdata", "data.xlsx", "stkData");
        String dealType = ExcelFile.dealType;
        $(org.openqa.selenium.By.xpath("//*[text()='" + dealType + "']")).click();
        Thread.sleep(2000);
    }

    @Step("User Selects Data from Menu")
    public void selectData() throws InterruptedException, IOException {
        ExcelFile objExcelFile = new ExcelFile();
        String filePath = System.getProperty("user.dir") + "\\src\\excelExportAndFileIO";
        objExcelFile.readExcel("C:\\Users\\kashaf.nazir\\IdeaProjects\\STKSerenityProject\\src\\test\\resources\\testdata", "data.xlsx", "stkData");
        String dataValue = ExcelFile.dataValue;
        $(org.openqa.selenium.By.xpath("//*[text()='" + dataValue + "']")).click();
        Thread.sleep(2000);
    }

    @Step("User Selects Offer")
    public void selectOffer() throws InterruptedException, IOException {
        $(StkHomePage.OFFER_CARD).click();
        Thread.sleep(3000);
    }

    /*@Step("Check Value Added Offer")
    * public String checkValueAddedOffer() {
    *
    * return $(StkHomePage.value_added_popup).getText();
    * }
    * */

    @Step("User Selects Value Added Offer from Menu")
    public void selectValueAddedOffer() throws InterruptedException, IOException {
        ExcelFile objExcelFile = new ExcelFile();
        String filePath = System.getProperty("user.dir") + "\\src\\excelExportAndFileIO";
        objExcelFile.readExcel("C:\\Users\\kashaf.nazir\\IdeaProjects\\STKSerenityProject\\src\\test\\resources\\testdata", "data.xlsx", "stkData");
        String valueAddedOffer = ExcelFile.valueAddedOffer;
        $(org.openqa.selenium.By.xpath("//button[text()='" + valueAddedOffer + "']")).click();
        Thread.sleep(2000);
    }

    @Step("Click Notify Customer Button")
    public void clickNotifyCustomerButton() throws InterruptedException {
        $(StkHomePage.NOTIFY_CUSTOMER_BUTTON).click();
        Thread.sleep(3000);
    }

    @Step("User Enters Email")
    public void enterEmail() throws InterruptedException, IOException {
        ExcelFile objExcelFile = new ExcelFile();
        String filePath = System.getProperty("user.dir") + "\\src\\excelExportAndFileIO";
        objExcelFile.readExcel("C:\\Users\\kashaf.nazir\\IdeaProjects\\STKSerenityProject\\src\\test\\resources\\testdata", "data.xlsx", "stkData");
        $(ExcelFile.emailId);
        $(StkHomePage.EMAIL_ID).type(ExcelFile.emailId);
        Thread.sleep(2000);
    }

    @Step("Send Email")
    public void clickOk() throws InterruptedException {
        $(StkHomePage.OK_BUTTON).click();
        Thread.sleep(3000);
    }


    @Step("the user verify that reference number is generated..")
    public String assertion_check() {
       /* String actualString = findElement(By.xpath("//p[2]/strong")).getText();
        assertTrue(actualString.contains("Your Reference Number is"));*/
        //METHOD # 2
        /*String actualString = driver.findElement(By.xpath("xpath")).getText();
        String expectedString = "ExpectedString";
        assertTrue(actualString.contains(expectedString));*/
        return $(StkHomePage.assert_Element).getText();

    }

    @Step("Click Notification Option")
    public void clickNotificationOption() throws InterruptedException, IOException {
        ExcelFile objExcelFile = new ExcelFile();
        String filePath = System.getProperty("user.dir") + "\\src\\excelExportAndFileIO";
        objExcelFile.readExcel("C:\\Users\\kashaf.nazir\\IdeaProjects\\STKSerenityProject\\src\\test\\resources\\testdata", "data.xlsx", "stkData");
        String notificationOption = ExcelFile.notificationOption;
        $(org.openqa.selenium.By.xpath("//button[text()='" + notificationOption + "']")).click();
        Thread.sleep(2000);
        //Running bat file
        /*ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "serenity-summary.bat");
        File dir = new File("C:/Users/kashaf.nazir/IdeaProjects/STKSerenityProject");
        pb.directory(dir);
        Process p = pb.start();*/
    }


}
