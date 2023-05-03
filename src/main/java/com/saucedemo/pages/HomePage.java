package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By productMessage = By.xpath("//span[@class='title']");
    By listOfProduct = By.xpath("//div[@class='inventory_item']");

    // This method is to get product message and return the text message.
    public String getProductMessage() {
        return getTextFromElement(productMessage);
    }

    // This method is for getting the product quantity Displayed on homepage
    public int numberOfProductDisplayed() {
        List<WebElement> product = driver.findElements(listOfProduct);
        return product.size();

    }
}
