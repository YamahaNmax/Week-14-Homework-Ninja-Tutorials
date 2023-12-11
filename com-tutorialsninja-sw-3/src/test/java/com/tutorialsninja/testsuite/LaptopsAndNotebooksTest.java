package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopsAndNotebooksTest extends TestBase {

    HomePage homePage = new HomePage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {

        mouseHoverToElementAndClick(By.xpath("//ul[@class='nav navbar-nav']/li[2]/a"));
        homePage.selectMenu("//ul[@class='nav navbar-nav']/li[2]/div[1]/a");

        selectByIndexFromDropDown(By.id("input-sort"), 4);

    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() {

        mouseHoverToElementAndClick(By.xpath("//ul[@class='nav navbar-nav']/li[2]/a"));
        homePage.selectMenu("//ul[@class='nav navbar-nav']/li[2]/div[1]/a");

        selectByIndexFromDropDown(By.id("input-sort"), 4);

        clickOnElement(By.xpath("//div[@id='content']/div[4]/div[4]/div[1]/div[2]/div[1]/h4/a"));

        String actualText = driver.findElement(By.xpath("//div[@id='content']/div/div[2]/h1")).getText();
        String expectedText = "MacBook";
        Assert.assertEquals(actualText, expectedText);

        clickOnElement(By.id("button-cart"));

//        String actualText1 = driver.findElement(By.xpath("//div[@id='product-product']/div[1]")).getText();
//        String expectedText1 = "Success: You have added MacBook to your shopping cart!\n" +
//                "×";
//        System.out.println(actualText1);
//        Assert.assertEquals(actualText1, expectedText1);

        clickOnElement(By.linkText("shopping cart"));

        String actualText2 = driver.findElement(By.xpath("//ul[@class='breadcrumb']/li[2]/a")).getText();
        String expectedText2 = "Shopping Cart";
        Assert.assertEquals(actualText2, expectedText2);

        String actualText3 = driver.findElement(By.xpath("//div[@class='table-responsive']/table[1]/tbody[1]/tr[1]/td[2]/A")).getText();
        String expectedText3 = "MacBook";
        Assert.assertEquals(actualText3, expectedText3);

        clearTextFromField(By.xpath("//div[@class='input-group btn-block']/input[1]"));
        sendKeysToElement(By.xpath("//div[@class='input-group btn-block']/input[1]"), "2");

        clickOnElement(By.xpath("//div[@class='input-group btn-block']/span[1]/button[1]"));

        String actualText4 = driver.findElement(By.xpath("//div[@id='checkout-cart']/div[1]")).getText();
        String expectedText4 = "Success: You have modified your shopping cart!\n" + "×";
        Assert.assertEquals(actualText4, expectedText4);

        String actualText5 = driver.findElement(By.xpath("//div[@id='content']/div[2]/div/table/tbody/tr[4]/td[2]")).getText();
        String expectedText5 = "$1,204.00";
        Assert.assertEquals(actualText5, expectedText5);

        clickOnElement(By.xpath("//div[@id='content']/div[3]/div[2]/a[1]"));

        String actualText6 = driver.findElement(By.xpath("//div[@id='checkout-checkout']/div[1]/div[1]/h1")).getText();
        String expectedText6 = "Checkout";
        Assert.assertEquals(actualText6, expectedText6);

        String actualText7 = driver.findElement(By.xpath("//div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2")).getText();
        String expectedText7 = "New Customer";
        Assert.assertEquals(actualText7, expectedText7);

        clickOnElement(By.xpath("//div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/label/input"));

        clickOnElement(By.xpath("//div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input"));

        sendKeysToElement(By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/fieldset/div[2]/input"), "Miten");
        sendKeysToElement(By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/fieldset/div[3]/input"), "Patel");
        sendKeysToElement(By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/fieldset/div[4]/input"), "m4mitzcodebuster@gmail.com");
        sendKeysToElement(By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/fieldset/div[5]/input"), "0123456789");
        sendKeysToElement(By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[1]/input"), "Codebuster");
        sendKeysToElement(By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[2]/input"), "3, Stan Stat");
        sendKeysToElement(By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[3]/input"), "london Road");
        sendKeysToElement(By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[4]/input"), "Stan");
        sendKeysToElement(By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[5]/input"), "HA7 4PD");
        selectByVisibleTextFromDropDown(By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[6]/select"), "United Kingdom");
        selectByVisibleTextFromDropDown(By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[7]/select"), "Greater London");

        clickOnElement(By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/input"));

        String actualText8 = driver.findElement(By.xpath("//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[1]")).getText();
        String expectedText8 = "Warning: No Payment options are available. Please contact us for assistance!";
        Assert.assertEquals(actualText8, expectedText8);

        sendKeysToElement(By.xpath("//div[@id='content']/div[1]/div[3]/div[2]/div[1]/p[2]/textarea"), "Please, Deliver ASAP. Thank you.!");

        clickOnElement(By.xpath("//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]"));

        clickOnElement(By.xpath("//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[2]"));

        String actualText9 = driver.findElement(By.xpath("//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[1]")).getText();
        String expectedText9 = "Warning: No Payment options are available. Please contact us for assistance!";
        Assert.assertEquals(actualText9, expectedText9);

    }
}