package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccounts extends Utility {

    By accountLink = By.xpath("//nav[@id='top']/div[1]/div[2]/ul/li[2]");
    By login = By.linkText("Login");
    By register = By.linkText("Register");
    By logout = By.linkText("Logout");

    public void myAccountLink(){
        clickOnElement(accountLink);
    }
    public void setLogin(){
        clickOnElement(login);
    }
    public void setRegister(){
        clickOnElement(register);
    }
    public void setLogout(){
        clickOnElement(logout);
    }
}
