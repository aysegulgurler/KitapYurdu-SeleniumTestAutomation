package com.kitapyurdu.pages;

import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {

    Methods methods;
    WebDriver driver;

    public PaymentPage(){

    methods = new Methods();

    }
    public void payment(){
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
    }
}
