package com.kitapyurdu.pages;

import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToFavorite {
    Methods methods;
    WebDriver driver;
    public AddToFavorite(){
        methods =new Methods();
    }

    public void addToFavorite(){
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
        String thirdproduct= methods.getAttribute(By.cssSelector(".product-cr:nth-child(10)"),"id");
        methods.click(By.cssSelector("#product-table>div:nth-child(11)>:nth-child(2)>:nth-child(3)>a[class='add-to-favorites']"));
        methods.waitBySeconds(2);
    }
}
