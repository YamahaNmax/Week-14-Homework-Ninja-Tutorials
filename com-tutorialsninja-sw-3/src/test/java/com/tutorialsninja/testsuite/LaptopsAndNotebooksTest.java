package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooks;
import com.tutorialsninja.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopsAndNotebooksTest extends TestBase {

    HomePage homePage = new HomePage();
    LaptopsAndNotebooks laptopsAndNotebooks = new LaptopsAndNotebooks();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {

        homePage.mouseHoverToLaptopsAndNotebooks();
        homePage.selectMenu("Show AllLaptops & Notebooks");

        laptopsAndNotebooks.setHighToLow();
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() {

        homePage.mouseHoverToLaptopsAndNotebooks();
        homePage.selectMenu("Show AllLaptops & Notebooks");

        laptopsAndNotebooks.setHighToLow();

        clickOnElement(By.xpath("//div[@id='content']/div[4]/div[4]/div[1]/div[2]/div[1]/h4/a"));

        String actualText = getTextFromElement(By.xpath("//div[@id='content']/div/div[2]/h1"));
        String expectedText = "MacBook";
        Assert.assertEquals(actualText, expectedText);

        clickOnElement(By.id("button-cart"));

        String actualText1 = getTextFromElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]"));
        String expectedText1 = "Success: You have added MacBook to your shopping cart!\n" +
                "×";
        Assert.assertEquals(actualText1, expectedText1);

        clickOnElement(By.linkText("shopping cart"));

        String actualText2 = getTextFromElement(By.xpath("//ul[@class='breadcrumb']/li[2]/a"));
        String expectedText2 = "Shopping Cart";
        Assert.assertEquals(actualText2, expectedText2);

        String actualText3 = getTextFromElement(By.xpath("//div[@class='table-responsive']/table[1]/tbody[1]/tr[1]/td[2]/A"));
        String expectedText3 = "MacBook";
        Assert.assertEquals(actualText3, expectedText3);

        clearTextFromField(By.xpath("//div[@class='input-group btn-block']/input[1]"));
        sendKeysToElement(By.xpath("//div[@class='input-group btn-block']/input[1]"), "2");

        clickOnElement(By.xpath("//div[@class='input-group btn-block']/span[1]/button[1]"));

        String actualText4 = getTextFromElement(By.xpath("//div[@id='checkout-cart']/div[1]"));
        String expectedText4 = "Success: You have modified your shopping cart!\n" + "×";
        Assert.assertEquals(actualText4, expectedText4);

        String actualText5 = getTextFromElement(By.xpath("//div[@id='content']/div[2]/div/table/tbody/tr[4]/td[2]"));
        String expectedText5 = "$1,204.00";
        Assert.assertEquals(actualText5, expectedText5);

        clickOnElement(By.xpath("//div[@id='content']/div[3]/div[2]/a[1]"));

        String actualText6 = getTextFromElement(By.xpath("//div[@id='checkout-checkout']/div[1]/div[1]/h1"));
        String expectedText6 = "Checkout";
        Assert.assertEquals(actualText6, expectedText6);

        String actualText7 = getTextFromElement(By.xpath("//div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2"));
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

        String actualText8 = getTextFromElement(By.xpath("//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[1]"));
        String expectedText8 = "Warning: No Payment options are available. Please contact us for assistance!";
        Assert.assertEquals(actualText8, expectedText8);

        sendKeysToElement(By.xpath("//div[@id='content']/div[1]/div[3]/div[2]/div[1]/p[2]/textarea"), "Please, Deliver ASAP. Thank you.!");

        clickOnElement(By.xpath("//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]"));

        clickOnElement(By.xpath("//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[2]"));

        String actualText9 = getTextFromElement(By.xpath("//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[1]"));
        String expectedText9 = "Warning: No Payment options are available. Please contact us for assistance!";
        Assert.assertEquals(actualText9, expectedText9);

    }
}