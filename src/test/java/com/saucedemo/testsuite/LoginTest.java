package com.saucedemo.testsuite;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    HomePage homepage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Enter the user in email field
        loginPage.enterEmailID("standard_user");

        // Enter the Password in Password field
        loginPage.enterPassword("secret_sauce");

        // Click on the Login Button
        loginPage.clickOnLoginButton();

        // Expected message
        String expectedProductMessage = "Products";

        // Wait until Element is displayed
        waitUntilVisibilityOfElementLocated(By.xpath("//span[@class='title']"), 5);

        // Get the actual text form the home page
        String actualProductMessage = homepage.getProductMessage();

        // Verify the expected message with actual message
        Assert.assertEquals(actualProductMessage, expectedProductMessage);
    }
@Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        // Enter the user in email field
        loginPage.enterEmailID("standard_user");

        // Enter the Password in Password field
        loginPage.enterPassword("secret_sauce");

        // Click on the Login Button
        loginPage.clickOnLoginButton();

        // Get the actual product quantity form the home page
        int actualQuantity = homepage.numberOfProductDisplayed();

        // Exacted quantity
        int expectedQuantity = 6;

        // Verify the expected quantity with actual quantity
        Assert.assertEquals(expectedQuantity, actualQuantity);

    }

}


