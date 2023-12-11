package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsTest extends TestBase {

    HomePage homePage = new HomePage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {

        mouseHoverToElementAndClick(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a"));
        homePage.selectMenu("//ul[@class='nav navbar-nav']/li[1]/div[1]/a");

        selectByIndexFromDropDown(By.id("input-sort"), 2);
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() {

        mouseHoverToElementAndClick(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a"));
        homePage.selectMenu("//ul[@class='nav navbar-nav']/li[1]/div[1]/a");

        selectByIndexFromDropDown(By.id("input-sort"), 1);

        clickOnElement(By.xpath("//div[@id='content']/div[4]/div[3]/div/div[2]/div/h4/a"));

        String actualText = driver.findElement(By.xpath("//div[@id='content']/div/div[2]/h1")).getText();
        String expectedText = "HP LP3065";
        Assert.assertEquals(actualText, expectedText);

        clearTextFromField(By.id("input-option225"));
        sendKeysToElement(By.id("input-option225"), "2022-11-30");

        clearTextFromField(By.id("input-quantity"));
        sendKeysToElement(By.id("input-quantity"), "1");

        clickOnElement(By.id("button-cart"));

        String actualText1 = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
        String expectedText1 = "Success: You have added HP LP3065 to your shopping cart!\n" + "×";
        Assert.assertEquals(actualText1, expectedText1);

        clickOnElement(By.linkText("shopping cart"));

        String actualText2 = driver.findElement(By.xpath("//ul[@class='breadcrumb']/li[2]/a")).getText();
        String expectedText2 = "Shopping Cart";
        Assert.assertEquals(actualText2, expectedText2);

        String actualText3 = driver.findElement(By.xpath("//div[@class='table-responsive']/table[1]/tbody[1]/tr[1]/td[2]/A")).getText();
        String expectedText3 = "HP LP3065";
        Assert.assertEquals(actualText3, expectedText3);

        String actualText4 = driver.findElement(By.xpath("//div[@class='table-responsive']/table[1]/tbody[1]/tr[1]/td[2]/small[1]")).getText();
        String expectedText4 = "Delivery Date:2022-11-30";
        Assert.assertEquals(actualText4, expectedText4);

        String actualText5 = driver.findElement(By.xpath("//div[@class='table-responsive']/table[1]/tbody[1]/tr[1]/td[3]")).getText();
        String expectedText5 = "Product 21";
        Assert.assertEquals(actualText5, expectedText5);

        String actualText6 = driver.findElement(By.xpath("//div[@id='content']/div[2]/div/table/tbody/tr[4]/td[2]")).getText();
        String expectedText6 = "$122.00";
        Assert.assertEquals(actualText6, expectedText6);
    }
}


