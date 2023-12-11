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

        mouseHoverToElementAndClick(By.xpath("//ul[@class='nav navbar-nav']/li[1]/a"));
        homePage.selectMenu("//ul[@class='nav navbar-nav']/li[1]/div[1]/a");

        String actualText = driver.findElement(By.tagName("h2")).getText();
        String expectedText = "Desktops";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {

        mouseHoverToElementAndClick(By.xpath("//ul[@class='nav navbar-nav']/li[2]/a"));
        homePage.selectMenu("//ul[@class='nav navbar-nav']/li[2]/div[1]/a");

        String actualText = driver.findElement(By.tagName("h2")).getText();
        String expectedText = "Laptops & Notebooks";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {

        mouseHoverToElementAndClick(By.xpath("//ul[@class='nav navbar-nav']/li[3]/a"));
        homePage.selectMenu("//ul[@class='nav navbar-nav']/li[3]/div[1]/a");

        String actualText = driver.findElement(By.tagName("h2")).getText();
        String expectedText = "Components";
        Assert.assertEquals(actualText, expectedText);
    }
}
