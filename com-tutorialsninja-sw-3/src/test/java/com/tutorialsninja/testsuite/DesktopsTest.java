package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.Desktops;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsTest extends TestBase {


    HomePage homePage = new HomePage();
    Desktops desktops = new Desktops();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {

        homePage.mouseHoverToDesktop();
        homePage.selectMenu("Show AllDesktops");

        desktops.sortByPositionZtoA();
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() {

        homePage.mouseHoverToDesktop();
        homePage.selectMenu("Show AllDesktops");

        desktops.sortByPositionAtoZ();

        clickOnElement(By.xpath("//div[@id='content']/div[4]/div[3]/div/div[2]/div/h4/a"));

        String actualText = getTextFromElement(By.xpath("//div[@id='content']/div/div[2]/h1"));
        String expectedText = "HP LP3065";
        Assert.assertEquals(actualText, expectedText);

        clearTextFromField(By.id("input-option225"));
        sendKeysToElement(By.id("input-option225"), "2022-11-30");

        clearTextFromField(By.id("input-quantity"));
        sendKeysToElement(By.id("input-quantity"), "1");

        clickOnElement(By.id("button-cart"));

        String actualText1 = getTextFromElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        String expectedText1 = "Success: You have added HP LP3065 to your shopping cart!\n" + "×";
        Assert.assertEquals(actualText1, expectedText1);

        clickOnElement(By.linkText("shopping cart"));

        String actualText2 = getTextFromElement(By.xpath("//ul[@class='breadcrumb']/li[2]/a"));
        String expectedText2 = "Shopping Cart";
        Assert.assertEquals(actualText2, expectedText2);

        String actualText3 = getTextFromElement(By.xpath("//div[@class='table-responsive']/table[1]/tbody[1]/tr[1]/td[2]/A"));
        String expectedText3 = "HP LP3065";
        Assert.assertEquals(actualText3, expectedText3);

        String actualText4 = getTextFromElement(By.xpath("//div[@class='table-responsive']/table[1]/tbody[1]/tr[1]/td[2]/small[1]"));
        String expectedText4 = "Delivery Date:2022-11-30";
        Assert.assertEquals(actualText4, expectedText4);

        String actualText5 = getTextFromElement(By.xpath("//div[@class='table-responsive']/table[1]/tbody[1]/tr[1]/td[3]"));
        String expectedText5 = "Product 21";
        Assert.assertEquals(actualText5, expectedText5);

        String actualText6 = getTextFromElement(By.xpath("//div[@id='content']/div[2]/div/table/tbody/tr[4]/td[2]"));
        String expectedText6 = "$122.00";
        Assert.assertEquals(actualText6, expectedText6);
    }
}


