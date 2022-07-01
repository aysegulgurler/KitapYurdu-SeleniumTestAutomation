package com.kitapyurdu.pages;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LogOut {

    Methods methods;
    public LogOut(){
        methods = new Methods();
    }
    public void logOut(){
        methods.waitBySeconds(2);
        WebDriver driver = BaseTest.driver;
        WebElement ele = driver.findElement(By.cssSelector(".menu.top.login>ul>li>a[class='common-sprite']"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".menu.top.login>ul>li>div>ul>:nth-child(4)>a"));
        methods.waitBySeconds(2);
    }
}
