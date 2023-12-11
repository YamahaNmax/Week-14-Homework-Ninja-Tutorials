package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {

        homePage.mouseHoverToDesktop();
        homePage.selectMenu("//ul[@class='nav navbar-nav']/li[1]/div[1]/a");

        String actualText = getTextFromElement(By.tagName("h2"));
        String expectedText = "Desktops";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {

        homePage.mouseHoverToLaptopsAndNotebooks();
        homePage.selectMenu("//ul[@class='nav navbar-nav']/li[2]/div[1]/a");

        String actualText = getTextFromElement(By.tagName("h2"));
        String expectedText = "Laptops & Notebooks";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {

        homePage.mouseHoverToComponents();
        homePage.selectMenu("//ul[@class='nav navbar-nav']/li[3]/div[1]/a");

        String actualText = getTextFromElement(By.tagName("h2"));
        String expectedText = "Components";
        Assert.assertEquals(actualText, expectedText);
    }
}
