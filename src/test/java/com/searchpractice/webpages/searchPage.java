package com.searchpractice.webpages;

import com.searchpractice.driver.driverManager;
import org.openqa.selenium.By;

public class searchPage extends driverManager {
   // public static String searchItem;
   // public static String enterProduct;

    public void search(String Product){
         //searchItem = Product;
        // driver.findElement(By.id("searchTerm")).clear();
    }
    public void enterProduct(String Product)
    {

        driver.findElement(By.xpath("//input[@id='searchTerm']")).sendKeys(Product);
    }
     public void clickSearch(){
        driver.findElement(By.xpath("//span[@class='_1gqeQ']")).click();
     }
}
