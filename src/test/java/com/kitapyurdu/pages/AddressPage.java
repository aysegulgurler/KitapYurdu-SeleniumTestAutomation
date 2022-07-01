package com.kitapyurdu.pages;

import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage {
    Methods methods;
    WebDriver driver;

    public AddressPage(){

        methods =new Methods();
    }
    public void adress(){
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".htabs.alt>a:nth-child(2)"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-firstname-companyname"),"Ayşegül");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-lastname-title"),"Gürler");
        methods.waitBySeconds(1);
        methods.click(By.cssSelector("select#address-zone-id"));
        methods.waitBySeconds(1);
        methods.click(By.cssSelector("select#address-zone-id>option[value='3321']"));
        methods.waitBySeconds(1);
        methods.click(By.id("address-county-id"));
        methods.waitBySeconds(1);
        methods.click(By.cssSelector("#address-county-id>option[value='89']"));
        methods.waitBySeconds(1);
        methods.click(By.cssSelector("input#district"));
        methods.waitBySeconds(1);
        methods.click(By.cssSelector("#districtautocomplete-list>div:nth-child(27)"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-address-text")," ********");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-postcode"),"*******");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-mobile-telephone"),"********");
        methods.waitBySeconds(1);
        methods.sendKeys(By.cssSelector("input#address-tax-id"),"*********");
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);
    }
}
