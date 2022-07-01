package com.kitapyurdu.pages;

import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class AddToBasket {

    Methods methods;
    WebDriver driver;

    public AddToBasket(){

        methods = new Methods();
    }
    public void addToBasket(){

        methods.waitBySeconds(2);
        Random rnd = new Random();
        List a=methods.urunler(By.cssSelector(".product-cr"));
        System.out.println(a.size());
        int r=rnd.nextInt(9);//liste boyutu için size kullanılıyor boyutu kadar randoma atandı
        System.out.println(r);
        WebElement element = (WebElement) a.get(r);
        element.click();
        methods.click(By.cssSelector(".add-to-cart.btn-orange.btn-ripple"));
        methods.waitBySeconds(2);
    }
}
