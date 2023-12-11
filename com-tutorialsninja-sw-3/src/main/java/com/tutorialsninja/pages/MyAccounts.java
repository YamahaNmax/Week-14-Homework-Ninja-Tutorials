package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyAccounts extends Utility {

    public void selectMyAccountOptions(String option) {
        WebElement menuLink = driver.findElement(By.linkText(option));
        menuLink.click();

    }
}
