package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.MyAccounts;
import com.tutorialsninja.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountsTest extends TestBase {


    HomePage homePage = new HomePage();
    MyAccounts myAccount = new MyAccounts();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {

        clickOnElement(By.xpath("//nav[@id='top']/div[1]/div[2]/ul/li[2]"));
        myAccount.selectMyAccountOptions("Register");

        String actualText = driver.findElement(By.xpath("//div[@id='account-register']/div[1]/div[1]/h1")).getText();
        String expectedText = "Register Account";
        Assert.assertEquals(actualText, expectedText);

    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {

        clickOnElement(By.xpath("//nav[@id='top']/div[1]/div[2]/ul/li[2]"));
        myAccount.selectMyAccountOptions("Login");

        String actualText = driver.findElement(By.xpath("//div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/h2")).getText();
        String expectedText = "Returning Customer";
        Assert.assertEquals(actualText, expectedText);

    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {

        clickOnElement(By.xpath("//nav[@id='top']/div[1]/div[2]/ul/li[2]"));
        myAccount.selectMyAccountOptions("Register");

        sendKeysToElement(By.xpath("//div[@id='account-register']/div[1]/div[1]/form/fieldset[1]/div[2]/div[1]/input[1]"), "Miten");
        sendKeysToElement(By.xpath("//div[@id='account-register']/div[1]/div[1]/form/fieldset[1]/div[3]/div[1]/input[1]"), "Patel");
        sendKeysToElement(By.xpath("//div[@id='account-register']/div[1]/div[1]/form/fieldset[1]/div[4]/div[1]/input[1]"), "Mitem4mitzcodebuster1@gmail.comn");
        sendKeysToElement(By.xpath("//div[@id='account-register']/div[1]/div[1]/form/fieldset[1]/div[5]/div[1]/input[1]"), "0123456789");
        sendKeysToElement(By.xpath("//div[@id='account-register']/div[1]/div[1]/form/fieldset[2]/div[1]/div[1]/input[1]"), "Codebuster@1234");
        sendKeysToElement(By.xpath("//div[@id='account-register']/div[1]/div[1]/form/fieldset[2]/div[2]/div[1]/input[1]"), "Codebuster@1234");

        clickOnElement(By.xpath("//div[@id='account-register']/div[1]/div[1]/form/fieldset[3]/div[1]/div[1]/label/input[1]"));

        clickOnElement(By.xpath("//div[@id='account-register']/div[1]/div[1]/form/div[1]/div[1]/input[1]"));

        clickOnElement(By.xpath("//div[@id='account-register']/div[1]/div[1]/form/div[1]/div[1]/input[2]"));

        String actualText = getTextFromElement(By.xpath("//div[@id='content']/h1"));
        String expectedText = "Your Account Has Been Created!";
        Assert.assertEquals(actualText, expectedText);

        clickOnElement(By.xpath("//div[@id='content']/div[1]/div[1]/a"));

        clickOnElement(By.xpath("//nav[@id='top']/div[1]/div[2]/ul/li[2]"));


        myAccount.selectMyAccountOptions("Logout");

        String actualText1 = getTextFromElement(By.xpath("//div[@id='content']/h1"));
        String expectedText1 = "Account Logout";
        Assert.assertEquals(actualText1, expectedText1);

        clickOnElement(By.xpath("//div[@id='content']/div[1]/div[1]/a"));

    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {

        clickOnElement(By.xpath("//nav[@id='top']/div[1]/div[2]/ul/li[2]"));
        myAccount.selectMyAccountOptions("Login");

        sendKeysToElement(By.xpath("//div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"), "m4mitzcodebuster@gmail.com");
        sendKeysToElement(By.xpath("//div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]"), "Codebuster@1234");

        clickOnElement(By.xpath("//div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]"));

        String actualText = getTextFromElement(By.xpath("//div[@id='content']/h2[1]"));
        String expectedText = "My Account";
        Assert.assertEquals(actualText, expectedText);

        clickOnElement(By.xpath("//nav[@id='top']/div[1]/div[2]/ul/li[2]"));

        myAccount.selectMyAccountOptions("Logout");

        String actualText1 = getTextFromElement(By.xpath("//div[@id='content']/h1"));
        String expectedText1 = "Account Logout";
        Assert.assertEquals(actualText1, expectedText1);

        clickOnElement(By.xpath("//div[@id='content']/div[1]/div[1]/a"));

    }

}
