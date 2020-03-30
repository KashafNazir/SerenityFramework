package stkstarter.navigation;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("http://sl-etisalatqa-3.systemsltd.local:7001")
public class StkHomePage extends PageObject {

    static By DATA_BUTTON = By.xpath("//body[contains(@class,'consumer')]/app-root/div[@class='container-fluid']/div[@class='ng-scope']/app-sales/div[@id='main']/div[@class='col-xs-12']/div[@class='container-fluid']/div[@class='row main-text main-text-A sales-wrapper sales-main-wrapper']/div[@class='col-xs-12 text-left']/div[@class='banner-wrapper']/div[@class='container-fluid']/div[@class='container-fluid']/div[@class='row']/div[@class='col-xs-12']/div[@class='ml-3 mr-3']/div[@class='config-tile-wrapper bg-business promotion-wrap']/div[@class='row']/div[@class='col-xs-12 col-static']/div[@class='tilesCarousel mT-30']/div[@class='swiper-wrapper tiles']/div[1]/div[2]");
    static By LIGHT_STARTER_BUTTON = By.xpath("//body[contains(@class,'consumer')]/app-root/div[@class='container-fluid']/div[@class='ng-scope']/app-sales/div[@id='main']/div[@class='col-xs-12']/div[@class='container-fluid']/div[@class='row main-text main-text-A sales-wrapper sales-main-wrapper']/div[@class='col-xs-12 text-left']/div[@class='banner-wrapper']/div[@class='container-fluid']/div[@class='container-fluid']/div[@class='row']/div[@class='col-xs-12']/div[@class='ml-3 mr-3']/div[@class='config-tile-wrapper bg-business promotion-wrap']/div[@class='row']/div[@class='col-xs-12 col-static']/div[@class='tilesCarousel mT-30']/div[@class='swiper-wrapper tiles']/div[2]/div[2]");
    static By YES_BUTTON = By.xpath("//body[contains(@class,'consumer')]/app-root/div[@class='container-fluid']/div[@class='ng-scope']/app-sales/div[@id='main']/div[@class='col-xs-12']/div[@class='container-fluid']/div[@class='row main-text main-text-A sales-wrapper sales-main-wrapper']/div[@class='col-xs-12 text-left']/div[@class='banner-wrapper']/div[@class='container-fluid']/div[@class='container-fluid']/div[@class='row']/div[@class='col-xs-12']/div[@class='ml-3 mr-3']/div[@class='config-tile-wrapper bg-business promotion-wrap']/div[@class='row']/div[@class='col-xs-12 col-static']/div[@class='tilesCarousel mT-30']/div[@class='swiper-wrapper tiles']/div[1]/div[2]");
    static By FREEDOM_PLAN_PACKAGE_BUTTON = By.cssSelector(".tiles-box.content.body-standard");
    static By NO_BUTTON = By.xpath("//button[text()='NO']");
    static By SAVE_BUTTON = By.xpath("//button[contains(text(),'Save')]");
    static By NO_DEVICES_BUTTON = By.cssSelector("body.consumer.modal-open:nth-child(2) div.container-fluid:nth-child(3) div.ng-scope div.modal.in.fade div.modal-dialog.text-center div.modal-content div.modal-footer modal-footer:nth-child(1) > button.btn.btn-default:nth-child(2)");

    //******************Test Case No 2***********************
    static By YES_DEVICE_BUTTON = By.xpath("//button[contains(text(),'YES')]");
    static By iOS_DEVICE_BUTTON = By.xpath("//body[contains(@class,'')]/app-root/div[@class='container-fluid']/div[@class='ng-scope']/app-sales/div[@id='main']/div[@class='col-xs-12']/div[@class='container-fluid']/div[@class='row main-text main-text-A sales-wrapper sales-main-wrapper']/div[@class='col-xs-12 text-left']/div[@class='banner-wrapper']/div[@class='container-fluid']/div[@class='container-fluid']/div[@class='row']/div[@class='col-xs-12']/div[@class='ml-3 mr-3']/div[@class='config-tile-wrapper bg-business promotion-wrap']/div[@class='row']/div[@class='col-xs-12 col-static']/div[@class='tilesCarousel mT-30']/div[@class='swiper-wrapper tiles']/div[1]/div[2]");
    static By MEDIUM_SCREEN_BUTTON = By.xpath("//body[contains(@class,'')]/app-root/div[contains(@class,'container-fluid')]/div[contains(@class,'ng-scope')]/app-sales/div[@id='main']/div[contains(@class,'col-xs-12')]/div[contains(@class,'container-fluid')]/div[contains(@class,'row main-text main-text-A sales-wrapper sales-main-wrapper')]/div[contains(@class,'col-xs-12 text-left')]/div[contains(@class,'banner-wrapper')]/div[contains(@class,'container-fluid')]/div[contains(@class,'container-fluid')]/div[contains(@class,'row')]/div[contains(@class,'col-xs-12')]/div[contains(@class,'ml-3 mr-3')]/div[contains(@class,'config-tile-wrapper bg-business promotion-wrap')]/div[contains(@class,'row')]/div[contains(@class,'col-xs-12 col-static')]/div[contains(@class,'tilesCarousel mT-30')]/div[contains(@class,'swiper-wrapper tiles')]/div[2]/div[2]");
    static By MEDIUM_CAPACITY_BUTTON = By.xpath("//body[contains(@class,'')]/app-root/div[contains(@class,'container-fluid')]/div[contains(@class,'ng-scope')]/app-sales/div[@id='main']/div[contains(@class,'col-xs-12')]/div[contains(@class,'container-fluid')]/div[contains(@class,'row main-text main-text-A sales-wrapper sales-main-wrapper')]/div[contains(@class,'col-xs-12 text-left')]/div[contains(@class,'banner-wrapper')]/div[contains(@class,'container-fluid')]/div[contains(@class,'container-fluid')]/div[contains(@class,'row')]/div[contains(@class,'col-xs-12')]/div[contains(@class,'ml-3 mr-3')]/div[contains(@class,'config-tile-wrapper bg-business promotion-wrap')]/div[contains(@class,'row')]/div[contains(@class,'col-xs-12 col-static')]/div[contains(@class,'tilesCarousel mT-30')]/div[contains(@class,'swiper-wrapper tiles')]/div[2]/div[2]");
    static By STANDALONE_BUTTON = By.xpath("//body[contains(@class,'')]/app-root/div[contains(@class,'container-fluid')]/div[contains(@class,'ng-scope')]/app-sales/div[@id='main']/div[contains(@class,'col-xs-12')]/div[contains(@class,'container-fluid')]/div[contains(@class,'row main-text main-text-A sales-wrapper sales-main-wrapper')]/div[contains(@class,'col-xs-12 text-left')]/div[contains(@class,'banner-wrapper')]/div[contains(@class,'container-fluid')]/div[contains(@class,'container-fluid')]/div[contains(@class,'row')]/div[contains(@class,'col-xs-12')]/div[contains(@class,'ml-3 mr-3')]/div[contains(@class,'config-tile-wrapper bg-business promotion-wrap')]/div[contains(@class,'row')]/div[contains(@class,'col-xs-12 col-static')]/div[contains(@class,'tilesCarousel mT-30')]/div[contains(@class,'swiper-wrapper tiles')]/div[1]/div[2]");
    static By FIRST_MOBILE_PACKAGE_BUTTON = By.xpath("//div[contains(@class,'swiper-wrapper offer-textarea main-swiper-wrapper')]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[3]");
    static By VALUE_ADDED_NO_BUTTON = By.xpath("//button[contains(text(),'NO')]");
    static By MOBILE_IOS_NEXT_BUTTON = By.xpath("//button[contains(@class,'btn btn-default ripple-effect btn-next')]");
    static By SAVE_IOS_MOBILE_BUTTON = By.xpath("//button[contains(text(),'Save')]");
    static By OK_IOS_MOBILE_BUTTON = By.xpath("//button[@class='btn btn-default']");

//*******************Test Case No 3********************

    static By VISITOR_BUTTON = By.xpath("//*[text()='VISITOR']");
    static By VISITOR_NEXT_BUTTON = By.xpath("//button[contains(text(),'Next')]");
    static By VISITOR_OFFER = By.xpath("//div/div/h3[text()='VISITOR LINE - SURF']");
    static By VISITOR_OFFER_NEXT = By.xpath("//button[@class='btn btn-default ripple-effect btn-next']");


    //****************Prepaid Resident Flow**************************
    static By OK_BUTTON = By.xpath("//button[text()='OK']");
    static By LAUNCH_BUTTON = By.xpath("//button[text()='Launch']");
    static By EMIRATES_ID = By.id("emiratesId");
    static By OFFER_CARD= By.xpath("//div/div/div/div[@class='tile-card__front']");
    static By NEXT_BUTTON = By.xpath("//button[text()='Next']");
    static By NOTIFY_CUSTOMER_BUTTON = By.xpath("//button[contains(text(),'Notify')]");
    static By EMAIL_ID = By.id("email");
    static By assert_Element= By.xpath("//p[2]/strong");

}
