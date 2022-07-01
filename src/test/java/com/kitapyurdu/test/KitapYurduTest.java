package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;

import com.kitapyurdu.pages.ProductPage;
import org.junit.Test;





public class KitapYurduTest extends BaseTest {

    @Test
    public void productTest(){
        ProductPage productPage = new ProductPage();

productPage.search();


    }


}
