package com.kitapyurdu.pages;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import sun.awt.windows.WPrinterJob;


import javax.management.Attribute;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.jar.Attributes;

public class ProductPage {
    Methods methods;
    WebDriver driver;
    Logger logger = LogManager.getLogger(ProductPage.class);
    String thirdProduct;

    public ProductPage() {
        methods = new Methods();
    }

    public void search() {
        methods.waitBySeconds(2);
        methods.sendKeys(By.name("search_keyword"), "Oyuncak");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(2);

            methods.scrollWithJavaScript(By.cssSelector("#product-table>div:nth-child(7)"));
            methods.waitBySeconds(2);
            methods.click(By.cssSelector("#product-table>div:nth-child(8)>:nth-child(2)>:nth-child(3)>a[class='add-to-favorites']"));
            methods.click(By.cssSelector("#product-table>div:nth-child(9)>:nth-child(2)>:nth-child(3)>a[class='add-to-favorites']"));
            methods.click(By.cssSelector("#product-table>div:nth-child(10)>:nth-child(2)>:nth-child(3)>a[class='add-to-favorites']"));
            String thirdproduct = methods.getAttribute(By.cssSelector(".product-cr:nth-child(10)"), "id");
            methods.click(By.cssSelector("#product-table>div:nth-child(11)>:nth-child(2)>:nth-child(3)>a[class='add-to-favorites']"));
            methods.waitBySeconds(2);

            methods.click(By.cssSelector(".logo-icon"));
            methods.waitBySeconds(2);
            methods.click(By.cssSelector(".lvl1catalog"));
            methods.waitBySeconds(2);
            methods.click(By.cssSelector(".landing-block>a:nth-child(2)>img"));
            methods.waitBySeconds(2);
            methods.click(By.cssSelector(".box.no-padding>div>div>div>select"));
            methods.waitBySeconds(2);
            methods.click(By.cssSelector(".box.no-padding>div>div>div>select>option:nth-child(6)"));
            methods.waitBySeconds(2);
            methods.click(By.cssSelector(".lvl2.js-bookCr>ul>li:nth-child(3)>span"));
            methods.waitBySeconds(2);
            methods.click(By.cssSelector(".open-menu-ct.bookAllCategories>div>:nth-child(3)>:nth-child(14)>a[class='mn-icon icon-angleRight']"));
            methods.waitBySeconds(2);

            Random rnd = new Random();
            List a = methods.urunler(By.cssSelector(".product-cr"));
            System.out.println(a.size());
            int r = rnd.nextInt(9);//liste boyutu için size kullanılıyor boyutu kadar randoma atandı
            System.out.println(r);
            WebElement element = (WebElement) a.get(r);
            element.click();
            methods.click(By.cssSelector(".add-to-cart.btn-orange.btn-ripple"));
            methods.waitBySeconds(2);

        methods.click(By.cssSelector("#header-top>div>:nth-child(2)>ul>:nth-child(1)>div>ul>li>a[class='common-sprite']"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("#header-top>div>:nth-child(2)>ul>:nth-child(1)>div>ul>li>:nth-child(2)>ul>li>a"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("#" + thirdproduct + ">div[class='grid_2 alpha omega relative']>div[class='hover-menu']>:nth-child(3)"));
        methods.waitBySeconds(2);

        methods.click(By.id("sprite-cart-icon"));
        methods.click(By.id("js-cart"));
        methods.waitBySeconds(2);

        methods.findElement(By.xpath("//input[@name=\'quantity\']")).clear();
        methods.sendKeys(By.xpath("//input[@name=\'quantity\']"), "2");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".fa.fa-refresh.green-icon"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".buttons>div>a[class='button red']"));
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
        methods.sendKeys(By.id("address-address-text"),"*************");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-postcode"),"*********");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-mobile-telephone"),"********");
        methods.waitBySeconds(1);
        methods.sendKeys(By.cssSelector("input#address-tax-id"),"*********");
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("credit-card-owner"),"Ayşegül Gürler");
        methods.waitBySeconds(2);
        methods.sendKeys(By.cssSelector("input#credit_card_number_1"),"2345");
        methods.sendKeys(By.cssSelector("input#credit_card_number_2"),"6798");
        methods.sendKeys(By.cssSelector("input#credit_card_number_3"),"4357");
        methods.sendKeys(By.cssSelector("input#credit_card_number_4"),"1234");
        methods.waitBySeconds(2);
        methods.click(By.id("credit-card-expire-date-month"));
        methods.click(By.cssSelector("#credit-card-expire-date-month>option[value='03']"));
        methods.waitBySeconds(1);
        methods.click(By.id("credit-card-expire-date-year"));
        methods.click(By.cssSelector("#credit-card-expire-date-year>option[value='2024']"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("credit-card-security-code"),"456");
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("input[name='agree']"));
        methods.waitBySeconds(1);
        methods.click(By.cssSelector("input.button"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".checkout-logo"));
        methods.waitBySeconds(2);






        }


    }
