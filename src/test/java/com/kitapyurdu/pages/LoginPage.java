package com.kitapyurdu.pages;

import com.kitapyurdu.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class LoginPage {

    Methods methods;
    public LoginPage(WebDriver driver){
        methods = new Methods();
    }

    public void login(){
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".menu-top-button.login"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.cssSelector(".ky-form-group>input#login-email"),"**********");
        methods.waitBySeconds(2);
        methods.sendKeys(By.cssSelector(".ky-form-group>input#login-password"),"*********");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(4);

    }
}
